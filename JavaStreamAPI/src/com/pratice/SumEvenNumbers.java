package com.pratice;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		int sum = numbers.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all even no :" + sum);

	}

}
