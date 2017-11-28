package com.mpp.lab8.prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Better {
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("cake");
		list.add("ballon");
		list.add("random");
		list.add("dominic");
		list.add("public");

		final Function<String, Predicate<String>> containsLetter = letter -> name -> name.contains("" + letter);

		final Function<String, Predicate<String>> notContainLetter = letter -> name -> !name.contains("" + letter);
		
		final Function<Integer, Predicate<String>> hasLength = letter -> name -> name.length() == letter;
		

		final List<String> validLetters = list.stream()
				.filter(containsLetter.apply("c"))
				.filter(notContainLetter.apply("d"))
				.filter(hasLength.apply(6))
				.collect(Collectors.toList());

		System.out.println(validLetters);

	}

}
