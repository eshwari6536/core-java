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

public class HibiWiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyEmployee eob=new MyEmployee(); 
		
		 // eob.setEid(127); eob.setEname("ram");
		 
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(MyEmployee.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg); 
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		//session.save(eob);// 
		tx.commit();
		System.out.println("Record saved");
		//Selecting All Records
		Query query = session.createQuery("from MyEmployee e");
		//select * from table
		
		List qryResults = query.list();

		Iterator<MyEmployee> it =qryResults.iterator();
		System.out.println("ID\tName");
		while (it.hasNext()) {
			MyEmployee emp =  it.next();
		System.out.println( emp.getEid()+"\t"+ emp.getEname());
		}

	}



	}


