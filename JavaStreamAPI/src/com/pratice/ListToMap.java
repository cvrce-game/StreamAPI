package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(101, "Alice", 75000), new Employee(102, "Bob", 50000),
				new Employee(103, "Charlie", 95000));
		Map<Integer, String> emp = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		emp.entrySet().forEach(empl -> System.out.println(empl.getKey() + " " + empl.getValue()));
	}

}
