package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ParseValidIntegers {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("10", "20", "abc", "", "30", null, "20");
		Set<Integer> ops = list.stream().filter(Objects::nonNull).map(arg -> arg.trim()).filter(s -> !s.isEmpty())
				.filter(s -> s.matches("-?\\d+")).map(Integer::parseInt).collect(Collectors.toSet());
		ops.stream().forEach(System.out::println);

	}
}
