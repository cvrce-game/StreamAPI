package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesbyDepartment {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Papun", "IT"), new Employee("Tatan", "HR"),
				new Employee("Raj", "IT"), new Employee("Sita", "Finance"), new Employee("Mohan", "HR"));

		Map<String, List<Employee>> emplList = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		emplList.forEach((deptName, empList) -> {
			System.out.println(deptName + " is having : "
					+ empList.stream().map(Employee::getName).collect(Collectors.joining(" ")));
		});
	}

}
