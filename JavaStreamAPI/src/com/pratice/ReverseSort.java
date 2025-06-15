package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSort {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Papun", "Kumar", "Mohapatra", "Raj");
		// names.stream().sorted(((a, b) ->
		// b.compareTo(a))).forEach(System.out::println);
		List<String> op = names.stream().sorted(((a, b) -> b.compareTo(a))).collect(Collectors.toList());
		System.out.println(op);
	}

}
