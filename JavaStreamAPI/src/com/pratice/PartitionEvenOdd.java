package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 5, 8, 21, 14, 7, 30, 11);
		Map<Boolean, List<Integer>> nos = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

		System.out.println("Even No: " + nos.get(true));

		System.out.println("Odd No: " + nos.get(false));

	}
}
