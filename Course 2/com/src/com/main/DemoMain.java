package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(54);
		emp.setName("Kostas");
		emp.setSalary(19000);
		
		EmployeeService es = new EmployeeService();
		String result = es.storeEmployee(emp);
		System.out.println(result);
	}

}
