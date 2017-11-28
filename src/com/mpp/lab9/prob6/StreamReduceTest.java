package com.mpp.lab9.prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReduceTest {

	public static Set<String> union(List<Set<String>> sets) {

		Set<String> allTheObjects = sets
									.stream()
									.flatMap(a -> a.stream())
									.collect(Collectors.toSet());


		return allTheObjects;

	}

	public static void main(String[] args) {
		Set<String> setA = new HashSet<>();
		setA.add("suresh");
		setA.add("sanjay");
		setA.add("rabin");
		setA.add("2");

		Set<String> setB = new HashSet<>();
		setB.add("1");
		setB.add("2");
		setB.add("3");
		setB.add("suresh");

		List<Set<String>> all = new ArrayList<>();
		all.add(setA);
		all.add(setB);

		
		Set<String> output = union(all);
		System.out.println(output);

	}

}
