package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			System.out.println("File loaded successfully");
			SessionFactory sf = con.buildSessionFactory(); // It is equal to connection in JDBC
			Session session = sf.openSession(); // It is equal to statement or prepared statement
			
			Employee emp = new Employee();
			emp.setId(11);
			emp.setName("Lex");
			emp.setSalary(28000);
			
			Transaction tran = session.getTransaction();
			tran.begin();
			session.save(emp);
			tran.commit();
			System.out.println("Record added!");
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
