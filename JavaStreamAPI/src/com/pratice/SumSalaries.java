package com.pratice;

import java.util.Arrays;
import java.util.List;

public class SumSalaries {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 75000), new Employee("Bob", 50000),
				new Employee("Charlie", 95000));

		double sumSal = employees.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println(sumSal);
	}

}
