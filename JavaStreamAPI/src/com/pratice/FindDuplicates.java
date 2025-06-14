package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Papun", "Kumar", "Mohapatra", "Papun", "Kumar", "Raj");

		names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet())
				.forEach(System.out::println);
		// .forEach(entry -> System.out.println(entry.getKey() + " -> " +
		// entry.getValue()));

	}

}
