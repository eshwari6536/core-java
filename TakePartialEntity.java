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

public class TakePartialEntity {

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
		
		  //Reading the partial entity : Query query2 =
		  Query query2 = session.createQuery("select  e.ename from MyEmployee e"); 
		  
		  List qryResults2 = query2.list();
		  
		  
		  Iterator it2 =qryResults2.iterator(); while (it2.hasNext()) { Object[] object
		  = (Object[]) it2.next(); System.out.println("ID : " + object[0] + " Name : "
		  + object[1]); }
		 
		//HQL Query with parameters :
		//HQL : from Employee e where e.deptNumber = ?

		//		OR

		//		HQL : from Employee e where e.deptNumber =:deptNo;

       /*Query query3 = session.createQuery("from MyEmployee e where e.eid=?");

    query3.setParameter(0,1);

     List<MyEmployee> qryResults3 = query3.list();
     Iterator it3 =qryResults3.iterator();
    while(it3.hasNext()) {
    	MyEmployee ob=(MyEmployee) it3.next();
    	System.out.println(ob.getEid()+" "+ob.getEname());*/
    }
	}


