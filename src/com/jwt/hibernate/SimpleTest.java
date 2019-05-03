package com.jwt.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = new Student();
		student.setName("Rizky Abraham");
		student.setAge(30);
		student.setPhone(2083090000);
		student.setDegree("Computer Science");
                
		Transaction tx = session.beginTransaction();
		session.save(student);
		System.out.println("Object saved successfully");
		tx.commit();
		session.close();
		factory.close();
	}
}