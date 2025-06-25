package com.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstRepeatedElementFinder {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "mango", "banana");

		Map<String, Long> ops = items.stream().collect(Collectors.groupingBy(arg -> arg, Collectors.counting()));

		Optional<Entry<String, Long>> opsFirst = ops.entrySet().stream().sorted(Comparator
				.comparing(Map.Entry<String, Long>::getValue).reversed().thenComparing(Map.Entry<String, Long>::getKey))
				.findFirst();

		opsFirst.ifPresent(arg -> System.out.println(arg.getKey() + " - > " + arg.getValue()));

	}

}
