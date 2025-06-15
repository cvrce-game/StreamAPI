package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 9, 1, 7, 3);

		Optional<Integer> max = numbers.stream().reduce((a, b) -> a > b ? a : b);
		max.ifPresent(value -> System.out.println("Max value is: " + value));

		Optional<Integer> min = numbers.stream().reduce((a, b) -> a < b ? a : b);
		min.ifPresent(value -> System.out.println("Min value is: " + value));
	}

}
