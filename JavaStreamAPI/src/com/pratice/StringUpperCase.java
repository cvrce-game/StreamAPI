package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("papun", "kumar", "mohapatra");

		List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("Uppercase names: " + upperNames);

		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
