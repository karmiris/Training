package com.dao;

import com.bean.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class EmployeeDao { // Database operations

	public int storeEmployee(Employee emp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// MySQL 8.x
			Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Simplilearn");
				
			PreparedStatement pstm = con.prepareStatement
					("insert into employee values (?, ?, ?)");
		
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setFloat(3, emp.getSalary());
			
			int res = pstm.executeUpdate();
			return res;
			
		} 
		catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
