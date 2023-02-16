package com;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoSelect2Columns {

	public static void main(String[] args) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			System.out.println("File loaded successfully");
			SessionFactory sf = con.buildSessionFactory(); // It is equal to connection in JDBC
			Session session = sf.openSession(); // It is equal to statement or prepared statement
			
			System.out.println("Retrieve two columns of entity class");
			TypedQuery<Object[]> tq = session.
					createQuery("select e.id, e.name from Employee e where e.salary> :esalary ");
			tq.setParameter("esalary", 10000f);
			List<Object[]> listOfEmp1 = tq.getResultList();
			System.out.println("Number of rows:" +listOfEmp1.size());
			Iterator<Object[]> li = listOfEmp1.iterator();
			while (li.hasNext()) {
				Object emp[] = li.next();
				System.out.println("ID: "+emp[0]+" Name: "+emp[1]); 
			}
						
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
}
