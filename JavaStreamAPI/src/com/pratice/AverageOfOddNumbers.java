package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfOddNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 20, 33, 42, 55);
		OptionalDouble avg = numbers.stream().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).average();
		System.out.println("Average of odd no: " + avg.getAsDouble());

	}

}
