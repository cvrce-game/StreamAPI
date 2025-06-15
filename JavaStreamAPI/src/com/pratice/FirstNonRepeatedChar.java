package com.pratice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "swiss";
		Optional<Character> firstNonRepeated = input.chars() // returns IntStream
				.mapToObj(c -> (char) c) // convert int to Character
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, // maintain insertion order
						Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();
		firstNonRepeated.ifPresent(System.out::println);
	}
}
