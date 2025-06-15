package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesbyDepartment {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Papun", "IT"), new Employee("Nita", "HR"),
				new Employee("Raj", "IT"), new Employee("Sita", "Finance"), new Employee("Mohan", "HR"));

		Map<String, Long> empCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		empCount.entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + " is having count of: " + entry.getValue()));
	}

}
