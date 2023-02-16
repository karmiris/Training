package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table (name = "employee")	// case insensitive
public class Employee {
	@Id 	// column with pk (primary key)
	@Column (name = "id")	// case insensitive
	private int id;
	@Column (name = "name")
	private String name;
	@Column (name = "salary")
	private float salary;
	
	// private variables; need methods to handle
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary (float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() { // allows element to be printed in a nice way
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
