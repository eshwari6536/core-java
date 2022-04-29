package Cushi.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MyAiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			MyAliasCl edu1 = new MyAliasCl();
			MyAliasCl edu2 = new MyAliasCl();
			MyAliasCl edu3 = new MyAliasCl();
			MyAliasCl edu4 = new MyAliasCl();
			
					edu1.setId(1);
					edu2.setName("Handa"); //persist in database
					
					edu2.setId(2);
					edu2.setName("Naru"); //persist in database
					edu3.setId(3);
					edu3.setName("Miwa"); //persist in database
					edu4.setId(4);
					edu4.setName("Tama"); //persist in database
					
					Configuration con=new Configuration().configure().addAnnotatedClass(MyAliasCl.class);
					ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
					
					
					SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
					Session session = sf.openSession();
					Transaction tx=session.beginTransaction();
					session.save(edu1);// insertion 
					session.save(edu2);
					session.save(edu3);  
					session.save(edu4); 
					
					
					//To fetch data
				edu1=(MyAliasCl) session.get(MyAliasCl.class,3);
					System.out.println(edu1);
//				edu2=   (MyAliasCl) session.get(MyAliasCl.class,4);
//					System.out.println(edu2);
//				edu2=   (MyAliasCl) session.get(MyAliasCl.class,3);
//				System.out.println(edu2);
				
					session.close();
					Session session1 = sf.openSession();
					Transaction tx1=session1.beginTransaction();
					
				edu1=(MyAliasCl) session1.get(MyAliasCl.class,3);
					System.out.println(edu1);
					tx.commit();
					System.out.println("Saved");
					session1.close();
					
	}

}
