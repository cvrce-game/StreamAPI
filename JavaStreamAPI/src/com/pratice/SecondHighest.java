package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 50, 40);
		Optional<Integer> num = numbers.stream().sorted((a, b) -> b - a).skip(1).findFirst();
		num.ifPresent(System.out::println);
	}

}
