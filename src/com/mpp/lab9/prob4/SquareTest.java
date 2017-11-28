package com.mpp.lab9.prob4;

import java.util.stream.IntStream;

public class SquareTest {

	public static void main(String[] args) {
		printSquares(5);
	}

	public static void printSquares(int num) {
		IntStream intStream = IntStream.iterate(1, n -> n + 1).limit(num);
		intStream.forEach(a -> System.out.print(a * a + " ,"));
	}
}
