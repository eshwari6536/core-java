package com.ranen;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ReadsSingleColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure().addAnnotatedClass(MyEmployee.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg); 
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		//session.save(eob);// 
		tx.commit();
		System.out.println("Record saved");
		//Reading Single Column
		Query query1 = session.createQuery("select e.eid from MyEmployee e");
			List qryResults1 = query1.list();

			Iterator it1 =qryResults1.iterator();
			
			while (it1.hasNext()) {
				Integer eid = (Integer) it1.next();
				System.out.println("ID: " + eid);
				}
	}

}
