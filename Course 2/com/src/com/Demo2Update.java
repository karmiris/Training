package com;
import java.sql.*;

public class Demo2Update {

	public static void main(String[] args) {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");	// MySQL 5.x
			Class.forName("com.mysql.cj.jdbc.Driver");	// MySQL 8.x
			System.out.println("Driver loaded successfully!");
			
			Connection con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Simplilearn");
			System.out.println("Database connected successfully!");
			
			Statement stmt = con.createStatement();
			
			int numLines = stmt.executeUpdate("update employee set salary = 1600 where id = 15");
			if (numLines > 0)
				System.out.println(numLines + " lines updated");
			else
				System.out.println("Record not found");
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
