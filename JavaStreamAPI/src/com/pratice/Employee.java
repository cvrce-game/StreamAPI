package com.pratice;

public class Employee {
	int id;
	String name;
	String department;
	double salary;
	int age;

	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

}
