package com.pratice;

import java.util.stream.IntStream;

public class PrimeCheck {
	public static void main(String[] args) {
		int no = 1;
		boolean check = no > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(no)).noneMatch(i -> no % i == 0);
		System.out.println(check ? no + ": is Prime no" : no + ": is Not prime");
	}
}
