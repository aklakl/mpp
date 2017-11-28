package com.mpp.lab11.prob2;

import java.util.ArrayList;
import java.util.List;

public class Capture {

	public static <T> void reverse(List<?> list) {
		reverseHelper(list);
	}

	public static void main(String[] args) {

		// List<Integer> list = new ArrayList<>();
		// list.add(1);
		// list.add(2);
		// list.add(9);
		// list.add(20);
		// list.add(3);

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");

		System.out.println("Before Reverse\n");
		System.out.println(list);
		reverse(list);
		System.out.println("After Reverse\n");
		System.out.println(list);

	}

	private static <T> void reverseHelper(List<T> list) {
		for (int i = 0, j = list.size() - 1; i < j; i++) {
			list.add(i, list.remove(j));
		}
	}
}
