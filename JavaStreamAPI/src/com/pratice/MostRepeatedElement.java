package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostRepeatedElement {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

		Map<String, Long> countOps = items.stream()
				.collect(Collectors.groupingBy((item) -> item, Collectors.counting()));
		Optional<Entry<String, Long>> maxele = countOps.entrySet().stream().max(Map.Entry.comparingByValue());

		maxele.ifPresent(data -> System.out.println(data.getKey() + "->" + data.getValue()));
	}
}
