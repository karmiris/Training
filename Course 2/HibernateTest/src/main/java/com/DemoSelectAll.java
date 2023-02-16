package com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoSelectAll {
	
	public static void main(String[] args) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			System.out.println("File loaded successfully");
			SessionFactory sf = con.buildSessionFactory(); // It is equal to connection in JDBC
			Session session = sf.openSession(); // It is equal to statement or prepared statement
			
			Transaction tran = session.getTransaction();
			
			System.out.println("Select All Query");
			Query qry = session.createQuery("select e from Employee e");
			//Query qry = session.createQuery("from Employee e"); // same as above
			//Query qry = session.createQuery("from Employee"); // same as above
			List<Employee> listOfEmp = qry.list();
			System.out.println("Number of rows:" +listOfEmp.size());
			
			// Alternative
			System.out.println("Retrieve All property of entity class");
			TypedQuery<Employee> tq = session.createQuery("select e from Employee e");
			List<Employee> listOfEmp1 = tq.getResultList();
			System.out.println("Number of rows:" +listOfEmp1.size());
			Iterator<Employee> li = listOfEmp1.iterator();
			while (li.hasNext()) {
				Employee emp = li.next();
				System.out.println(emp); // calls toString override in Employee.java
			}
						
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
}
