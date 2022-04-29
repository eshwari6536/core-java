package best.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class FirstMainCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClassCrud ed1 = new FirstClassCrud();
		FirstClassCrud ed2 = new FirstClassCrud();
		FirstClassCrud ed3 = new FirstClassCrud();
		FirstClassCrud ed4 = new FirstClassCrud();
		
				ed1.setId(1);
				ed1.setName("carla"); //persistent in database
				ed2.setId(2);
				ed2.setName("monty"); 
				ed3.setId(3);
				ed3.setName("alex");
				ed4.setId(4);
				ed4.setName("GILBERTi"); 
				
				
				Configuration con=new Configuration().configure().addAnnotatedClass(FirstClassCrud.class);
				ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
				
				
				SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
				Session session = sf.openSession();
				Transaction tx=session.beginTransaction();
				session.save(ed1);// insertion 
				session.save(ed2);
				session.save(ed3);  
				session.save(ed4);
				
				tx.commit();//then oly values will be inserted
				
				
				//To fetch data
//			edu1=(FirstClassCrud) session.get(FirstClassCrud.class,3);
//				System.out.println(edu1);
//			
			
				//session.close();
	}

}
