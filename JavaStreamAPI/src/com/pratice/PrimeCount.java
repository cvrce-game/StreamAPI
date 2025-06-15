package com.pratice;

import java.util.stream.IntStream;

public class PrimeCount {

	public static void main(String[] args) {
		int start = 1;
		int end = 50;

		long primeNumberCount = IntStream.rangeClosed(start, end).filter(PrimeCount::isPrime).count();

		System.out.println("Prime no count between " + start + " and " + end + " : " + primeNumberCount);
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(num -> number % num != 0);
	}

}
