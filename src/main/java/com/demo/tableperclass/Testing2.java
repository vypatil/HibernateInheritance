package com.demo.tableperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing2 {
	
	public static void main(String[] args) {
		
		India i1 = new India();
		
		Gov_University g1 = new Gov_University();
		g1.setUnv_name("Nalanda University");
		g1.setFounder("Chandragupta mourya");
		g1.setYear(1197);
		
		
		Private_University p1 = new Private_University();
		p1.setUnv_name("SGU");
		p1.setOwner("Sanjay Ghodawat");
		p1.setRating(9);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(i1);
		session.save(g1);
		
		session.save(p1);
		
		tx.commit();
		session.close();
		
	}

}
