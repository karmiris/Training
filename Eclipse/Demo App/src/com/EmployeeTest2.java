package com;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2();
		emp1.displayEmpInfo();		// default value 
		
		Employee2 emp2  = new Employee2();
		emp2.id=2;
		emp2.name="John";
		emp2.salary=25000;
		emp2.displayEmpInfo();   // set the value and display the value
		
		Employee2 emp3 = new Employee2();
		emp3.setEmpInfo(3, "Lex", 28000);  // we pass the value 
		emp3.displayEmpInfo();
		
		Employee2 emp4 = new Employee2();
		emp4.setEmpInfo(4, "Neena", 32000);
		emp4.calSalary();
		emp4.displayEmpInfo();
		
		Employee2 emp5 = new Employee2(5, "Steven", 26000);
		emp5.calSalary();
		emp5.displayEmpInfo();
	}

}