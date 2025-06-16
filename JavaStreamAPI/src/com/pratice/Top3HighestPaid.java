package com.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3HighestPaid {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", "CS", 75000), new Employee("Bob", "CS", 50000),
				new Employee("Charlie", "CS", 95000), new Employee("David", "CS", 60000));

		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3)
				.forEach(emp -> System.out.println(emp.getName() + " ->" + emp.getSalary()));
	}

}
