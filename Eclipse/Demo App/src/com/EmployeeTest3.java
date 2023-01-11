package com;

public class EmployeeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee3 emp1 = new Employee3();
//			emp1.id=10;
//			emp1.name = "Steven";
//			emp1.salary = -12000;
			
			emp1.setValue(10, "Steven", -12000);
			emp1.display();
	}

}