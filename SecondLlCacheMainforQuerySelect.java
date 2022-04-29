package canni.cold;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SecondLlCacheMainforQuerySelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStoCl ob=null;
		Configuration con=new Configuration().configure().addAnnotatedClass(MyStoCl.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		//SessionFactory sf = con.buildSessionFactory(); //deprecated
		SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
		Session session = sf.openSession();
	
		
		  Transaction tx=session.beginTransaction();
		  MyStoCl mob = new MyStoCl();
			 mob.setId(4);
			 mob.setName("Vanya");
			 session.save(mob);
			 MyStoCl mob1 = new MyStoCl();
			 mob1.setId(5);
			 mob1.setName("Klaus");
			 session.save(mob1);
			 MyStoCl mob2 = new MyStoCl();
			 mob2.setId(6);
			 mob2.setName("Five");
			 session.save(mob2);
			 tx.commit();
	Query q1=session.createQuery("from MyStoCl where id=4");
	q1.setCacheable(true);
	ob=(MyStoCl) q1.uniqueResult();
	System.out.println(ob);
	
		//tx.commit();
		session.close();
		Session session1 = sf.openSession();
		
		
		  Transaction tx1=session1.beginTransaction();
		  
		  Query q2=session1.createQuery("from MyStoCl where id=4");
		 q2.setCacheable(true);
		  ob=(MyStoCl) q2.uniqueResult();
			System.out.println(ob);//if toString not there object hashcode is printed
		
		tx1.commit();
		
session1.close();
	}

}
