package com.mpp.extra.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {

		MyFunctionalInterface<Integer, Integer, Integer, Integer, Integer> volume = (w, x, y, z) -> w + x + y + z;

		System.out.println("Sum is : " + volume.apply(2, 3, 4, 5));

		// Function composition
		Function<Integer, Integer> times2 = e -> e * 2;
		Function<Integer, Integer> squared = e -> e * e;

		int result = times2.compose(squared).apply(4);
		System.out.println("result = " + result);

		int result2 = times2.andThen(squared).apply(4);
		System.out.println("result2 = " + result2);

		// BiFunction composition

		BiFunction<Integer, Integer, Integer> firstSum = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> secondSum = (c, d) -> c + d;

		BiFunction<BiFunction<Integer, Integer, Integer>, BiFunction<Integer, Integer, Integer>, Integer> res = 
				(firstBiFunction,secBiFunction) -> (firstBiFunction.apply(3, 4) + firstBiFunction.apply(5, 6));

		System.out.println("Sum of two bifunction :" + res.apply(firstSum, secondSum));

	}

}
