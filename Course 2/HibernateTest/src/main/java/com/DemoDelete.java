package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoDelete {

	public static void main(String[] args) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			System.out.println("File loaded successfully");
			SessionFactory sf = con.buildSessionFactory(); // It is equal to connection in JDBC
			Session session = sf.openSession(); // It is equal to statement or prepared statement
			
			Transaction tran = session.getTransaction();
			
			System.out.println("Delete Query");
			Employee emp = session.get(Employee.class, 11);
			
			if (emp==null) {
				System.out.println("Id not present");
			}
			else {
				tran.begin();
				session.delete(emp);	// Run delete
				tran.commit();
				System.out.println("Record deleted!");
			}
						
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
