package com.ranen;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class FolllowUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure().addAnnotatedClass(MyEmployee.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		//SessionFactory sf = con.buildSessionFactory(); //deprecated
		SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		//session.save(eob1);// insert but how
	
		// simple update
        System.out.println("Simple update");

        String qryString = "update MyEmployee e set e.ename='esh' where e.eid=134";
        Query query = session.createQuery(qryString);
        int count = query.executeUpdate();

        System.out.println(count + " Record(s) Updated.");
        //update query parameters
        System.out.println("Updating with Query Parameters ");

        String qryString2 = "update MyEmployee e set e.ename='jhonnu' where e.eid=?";
        Query query2 = session.createQuery(qryString2);
        query2.setParameter(0, 1);
        query2.executeUpdate();

        /*int count2 = query2.executeUpdate();

        System.out.println(count2 + " Record(s) Updated.");

        System.out.println("Updating with Named Parameters");
        String qryString3 = "update EmployeeClassHib e set e.address='Goa' where e.eid=:empid";
        Query query3 = session.createQuery(qryString3);
        query3.setParameter("empid", 3);
        query3.executeUpdate();

        int count3 = query3.executeUpdate();

        System.out.println(count3 + " Record(s) Updated.");*/

        tx.commit();
        session.clear();
        session.close();
        System.out.println("Transaction Completed !");
	

}
 
	}


