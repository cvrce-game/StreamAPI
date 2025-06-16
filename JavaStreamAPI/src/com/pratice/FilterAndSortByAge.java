package com.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilterAndSortByAge {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 28, 75000), new Employee("Bob", 35, 50000),
				new Employee("Charlie", 40, 95000), new Employee("David", 32, 60000), new Employee("Eve", 25, 88000));
		employees.stream().filter(emp -> emp.getAge() > 30).sorted(Comparator.comparing(Employee::getAge).reversed())
				.forEach(emp -> System.out.println(emp.getName() + "-->>" + emp.getAge()));
	}

}
