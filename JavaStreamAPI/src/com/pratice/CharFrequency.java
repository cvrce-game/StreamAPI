package com.pratice;

import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
	public static void main(String[] args) {
		String input = "hello world";

		Map<Character, Long> frequencyMap = input.chars().filter(c -> c != ' ') // Optional: skip spaces
				.mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	}
}
