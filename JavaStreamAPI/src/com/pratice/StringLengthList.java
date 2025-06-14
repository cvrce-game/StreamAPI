package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthList {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Papun", "Kumar", "Mohapatra");

        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("String lengths: " + lengths);
	}

}
