package com.demo.singletable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
//		Vehicle v1 = new Vehicle("VehicleList");
		
		Bike b1 = new Bike();
		b1.setName("kawasaki");
		b1.setBiketype("sportbike");
		b1.setStand("doubleStand");
		
		Car c1 = new Car();
		c1.setName("lamborghini");
		c1.setCartype("sportcar");
		c1.setAirconditioner("AirconditionSamsung");
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		session.save(v1);
		session.save(b1);
		session.save(c1);
		
		tx.commit();
		session.close();
	}
}
