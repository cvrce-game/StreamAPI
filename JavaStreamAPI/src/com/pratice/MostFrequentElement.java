package com.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostFrequentElement {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob", "Alice");
		Map<String, Long> ops = names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));

		Entry<String, Long> opsMax = ops.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).orElse(null);

	}
}
