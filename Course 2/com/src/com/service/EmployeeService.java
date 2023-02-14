package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService { // business logic
	
	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		
		if (emp.getSalary() > 12000) {// business condition
			if (ed.storeEmployee(emp) > 0)
				return "Record inserted in Database";
			else
				return "Record not inserted in Database";
		}
		else 
			return "Salary must be over 12000";
	}
}
