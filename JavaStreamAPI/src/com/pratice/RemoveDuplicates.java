package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Papun", "Kumar", "Mohapatra", "Papun", "Kumar", "Raj");

		List<String> uniqueNames = names.stream().distinct().collect(Collectors.toList());

		System.out.println("Unique names: " + uniqueNames);
	}

}
