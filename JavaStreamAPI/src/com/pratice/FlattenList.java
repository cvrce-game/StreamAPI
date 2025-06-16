package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {

	public static void main(String[] args) {
		List<List<String>> nestedList = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"),
				Arrays.asList("E", "F"));
		List<String> ops = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(ops);
	}

}
