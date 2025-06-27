package com.pratice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		String sentence = "Java is great, and Java is powerful.";

		String[] ListWorld = sentence.split("\\W+");
		Map<String, Long> ops = Arrays.stream(ListWorld).filter(arg -> !arg.isEmpty()).map(arg -> arg.toLowerCase())
				.collect(Collectors.groupingBy(arg -> arg, Collectors.counting()));

		ops.entrySet().forEach(ent -> System.out.println(ent.getKey() + "->" + ent.getValue()));

	}

}
