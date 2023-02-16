package com;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoSelectColumn {

	public static void main(String[] args) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			System.out.println("File loaded successfully");
			SessionFactory sf = con.buildSessionFactory(); // It is equal to connection in JDBC
			Session session = sf.openSession(); // It is equal to statement or prepared statement
			
			System.out.println("Retrieve one column of entity class");
			TypedQuery<String> tq = session.
					createQuery("select e.name from Employee e where e.salary> :esalary ");
			tq.setParameter("esalary", 10000f);
			List<String> listOfEmp1 = tq.getResultList();
			System.out.println("Number of rows:" +listOfEmp1.size());
			Iterator<String> li = listOfEmp1.iterator();
			while (li.hasNext()) {
				String name = li.next();
				System.out.println(name); 
			}
						
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
}
