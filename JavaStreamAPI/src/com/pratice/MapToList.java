package com.pratice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Alice");
		map.put(2, "Bob");
		map.put(3, "Charlie");

		List<String> ops = map.entrySet().stream().map(entry -> entry.getKey() + " ->" + entry.getValue())
				.collect(Collectors.toList());
		System.out.println(ops);
	}

}
