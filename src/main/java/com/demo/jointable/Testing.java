package com.demo.jointable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {

		Jungle j1 = new Jungle();
		
		Coconut c1 = new Coconut();
		c1.setSer_No(1);
		c1.setTree_name("Coconut");
		c1.setHeight(50);
		c1.setLocation("on beach");
		
		
		Mango m1 = new Mango();
		m1.setSer_No(2);
		m1.setTree_name("Mango");
		m1.setType("flowering plant");
		m1.setGrowing_duration(30);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(j1);
		session.save(c1);
		session.save(m1);
		
		tx.commit();
		sf.close();
		
	}
	
	

}
