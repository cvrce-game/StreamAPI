package com.pratice;

public class Employee {
	String name;
	String department;
	double salary;

	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

}
