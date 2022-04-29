package canni.cold;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MyStoMain {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStoCl ob=null;
Configuration con= new Configuration().configure().addAnnotatedClass(MyStoCl.class);		//hib connec1
ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();		//hib connec2
		
//SessionFactory sf=con.buildSessionFactory();	 //deprecated
		SessionFactory sf = con.buildSessionFactory(reg); //not deprecated//hib connec3
Session session=sf.openSession();		//hib connec4
	
		
		 Transaction tx =session.beginTransaction();
			/*
			 * ob=(MyStoCl) session.get(MyStoCl.class,2); System.out.println(ob);
			 * tx.commit(); session.close();
			 */
		//Session session1 = sf.openSession();
		
		
		  //Transaction tx1=session1.beginTransaction();
		  //transient
//		 MyStoCl mob = new MyStoCl();
//		 mob.setId(1);
//		 mob.setName("Esha");
//		 session.save(mob);
//		 MyStoCl mob1 = new MyStoCl();
//		 mob1.setId(2);
//		 mob1.setName("Esham");
//		 session.save(mob1);
//		 MyStoCl mob2 = new MyStoCl();
//		 mob2.setId(3);
//		 mob2.setName("Calypso");
//		 session.save(mob2);
//		 tx.commit();
			/*
			 * ob=(MyStoCl) session1.get(MyStoCl.class,2);
			 * 
			 * //start session session ob=(MyStoCl) session1.get(MyStoCl.class,2);
			 * System.out.println(ob); tx1.commit(); session1.close();
			 */
		//MyStoCl mob;
		/*ob=(MyStoCl)session.get(MyStoCl.class,1);//happens due to override
		System.out.println(ob);
		ob=(MyStoCl)session.get(MyStoCl.class,2);
		System.out.println(ob);*/
//		mob1=(MyStoCl)session.get(MyStoCl.class,2);
//		System.out.println(mob1);
	}

//}
