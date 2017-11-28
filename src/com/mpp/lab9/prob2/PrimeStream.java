package com.mpp.lab9.prob2;

import java.math.BigInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream {

	// private static final Stream<BigInteger> myStream = Stream.generate(() ->
	// nextPrime());

	private static final Supplier<Stream<BigInteger>> supplier = () -> Stream.generate(() -> nextPrime());

	public static int currentPrime = 1;

	public void printFirstNPrimes(int n) {
		currentPrime = 1;
		Stream<BigInteger> s = supplier.get().limit(n);
		s.forEach(x -> System.out.print(x + " "));
	}

	/**
	 * Checks if number is prime or not
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * 
	 * @return next prime number
	 */
	public static BigInteger nextPrime() {

		int primeNumber = currentPrime;
		boolean flag = true;
		while (flag) {
			int number = currentPrime + 1;
			boolean check = isPrime(number);
			if (check) {
				flag = false;
				primeNumber = number;
			}
			currentPrime++;
		}
		return BigInteger.valueOf(primeNumber);
	}
}
