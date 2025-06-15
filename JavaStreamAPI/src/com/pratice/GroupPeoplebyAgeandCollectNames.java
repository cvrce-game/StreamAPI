package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupPeoplebyAgeandCollectNames {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Papun", 25), new Person("Mita", 30), new Person("Sita", 25),
				new Person("Raj", 30), new Person("Mohan", 28));

		Map<Integer, List<String>> empList = people.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));

		empList.forEach((age, name) -> {
			System.out.println(
					"In age group of " + age + " is having names : " + name.stream().collect(Collectors.joining(" ")));
		});
	}

}
