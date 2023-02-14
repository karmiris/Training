package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;

public class Demo2Prepaired {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			//Class.forName("com.mysql.jdbc.Driver");	// MySQL 5.x
			Class.forName("com.mysql.cj.jdbc.Driver");	// MySQL 8.x
			System.out.println("Driver loaded successfully!");
		
			Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Simplilearn");
			System.out.println("Database connected successfully!");
		
			Statement stmt = con.createStatement();
		
			// Prepared query sent to db on creation; faster when running repeatedly
			PreparedStatement pstm = con.prepareStatement("insert into employee values (?, ?, ?)");
		
			System.out.println("New ID:");
			int id = sc.nextInt();
			pstm.setInt(1, id);
		
			System.out.println("New Name:");
			String name = sc.next();
			pstm.setString(2, name);
		
			System.out.println("New Salary:");
			float salary = sc.nextFloat();
			pstm.setFloat(3, salary);
		
			int numLines = pstm.executeUpdate();
			System.out.println(numLines + " lines inserted");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
