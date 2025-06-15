package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberCommaSeparated {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		String ops = numbers.stream().map(String::valueOf).collect(Collectors.joining(" "));
		System.out.println("Output is : " + ops);

	}

}
