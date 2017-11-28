package com.mpp.extra.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// Player p = new Player("suresh", "football");
		// System.out.println(p);

		String[] arr = { "suresh", "santosh", "rojan", "suresh" };
		String target = "suresh";

		Object[] arr2 = { "a", null, "b", null, null };
		Object target2 = null;

		System.out.println("Not null occurences : "
				+ countOccurences(arr, target));
		System.out.println("Null occurences : "
				+ countOccurences(arr2, target2));

		System.out.println("Count using stream : "
				+ countOccurences2(arr, target));

		System.out.println("Max2 is: " + max2(Arrays.asList(1, 2, 3, 4, 6)));
		System.out.println("Integers: Max3 is: " + max3(Arrays.asList(1, 2, 3, 4, 7, 6)));
		System.out.println("String : Max3 is: " + max3(Arrays.asList("aas","cx","zww","ysdas")));
		System.out.println("Sorted List is: " + universalSorter(Arrays.asList(5,6,2,1,9,0,10)));
		System.out.println("Sorted List String is: " + universalSorter(Arrays.asList("aas","cx","zww","ysdas")));

	}

	public static <T> int countOccurences(T[] arr, T target) {

		int count = 0;
		if (target != null) {
			for (T t : arr) {
				if (t.equals(target))
					count++;
			}
		} else {
			for (T t : arr) {
				if (t == null)
					count++;
			}
		}
		return count;
	}

	public static <T> int countOccurences2(T[] arr, T target) {
		int count = (int) Stream.of(arr).filter(t -> t.equals(target)).count();
		return count;
	}

	public static Integer max(List<Integer> list) {
		Integer max = list.get(0);
		for (Integer integer : list) {
			if (integer.compareTo(max) > 0)
				max = integer;
		}

		return max;
	}

	public static Integer max2(List<Integer> list) {
		//1st way
		// return list.stream().max(Comparator.comparing(i -> i)).get();
		
		//2nd way
		return list.stream().max(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		}).get();
	}

	public static <T extends Comparable<T>> T max3(List<T> list) {
		return list.stream().max(Comparator.comparing(i -> i)).get();
	}
	
	public static <T extends Comparable<T>> List<T> universalSorter(List<T> list) {
		return list.stream().sorted(new Comparator<T>() {
			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		}).collect(Collectors.toList());
	}
}
