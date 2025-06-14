package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesByLetter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Papun", "Kumar", "Priya", "Mona", "Pritam");

		// Filter names starting with 'P'
		List<String> filtered = names.stream().filter(name -> name.startsWith("P")).collect(Collectors.toList());

		System.out.println("Names starting with 'P': " + filtered);
	}

}
