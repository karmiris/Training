package com;
import java.sql.*;

public class Demo2 {

	public static void main(String[] args) {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");	// MySQL 5.x
			Class.forName("com.mysql.cj.jdbc.Driver");	// MySQL 8.x
			System.out.println("Driver loaded successfully!");
			
			Connection con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Simplilearn");
			System.out.println("Database connected successfully!");
			
			Statement stmt = con.createStatement();
			
			int numLines = stmt.executeUpdate("insert into employee values (15, 'Jack', 1000)");
			System.out.println(numLines + " lines inserted");
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
