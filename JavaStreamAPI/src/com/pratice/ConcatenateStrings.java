package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Papun", "Kumar", "Mohapatra");
		String ops = names.stream().collect(Collectors.joining(" "));
		System.out.println(ops);
		System.out.println(names.stream().collect(Collectors.joining(" ", "[", "]")));
	}

}
