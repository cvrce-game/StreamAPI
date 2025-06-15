package com.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeePerDepartment {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Papun", "IT", 60000), new Employee("Kumar", "HR", 55000),
				new Employee("Raj", "IT", 75000), new Employee("Sita", "Finance", 50000),
				new Employee("Mohan", "HR", 58000));
		Map<String, Optional<Employee>> empList = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

		empList.forEach((dept, empOpt) -> {
			empOpt.ifPresent(emp -> {
				System.out.println("In " + dept + " department, " + emp.getName() + " is getting the highest salary.");
			});
		});
	}

}
