package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestStringFinder {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Papun", "Kumar", "Mohapatra", "Raj");
		Optional<String> ops = names.stream().max((a, b) -> Integer.compare(a.length(), b.length()));
		ops.ifPresent(System.out::println);
	}
}
