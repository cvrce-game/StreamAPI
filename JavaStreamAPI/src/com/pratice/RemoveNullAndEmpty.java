package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullAndEmpty {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "", null, "banana", "  ", "orange", null);
		items.stream().filter(Objects::nonNull).map(str -> str.trim()).filter(Objects::nonNull)
				.forEach(str -> System.out.println(str));

	}

}
