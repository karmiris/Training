package com.entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity	// mandatory
@Table (name = "employee")	// case insensitive; mandatory if different
public class Product {
	@Id 	// column with pk (primary key); mandatory
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column (name = "id")	// case insensitive; mandatory if different
	private int id;
	@Column (name = "name")
	private String name;
	@Column (name = "salary")
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
