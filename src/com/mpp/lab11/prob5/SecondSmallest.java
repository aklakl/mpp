package com.mpp.lab11.prob5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondSmallest {

	public static <T extends Comparable> T secondSmallest(List<T> list) {

		/**
		 * First way
		 */
		// T firstMin, secondMin;
		// firstMin = secondMin = list.get(0);
		//
		// for (int i = 0; i < list.size() ; i ++) {
		// T t = list.get(i);
		// if (t.compareTo(firstMin) < 0) {
		// secondMin = firstMin;
		// firstMin = t;
		// } else if (t.compareTo(secondMin) < 0 && t != firstMin) {
		// secondMin = t;
		// }
		// }
		// return secondMin;

		/**
		 * Second way
		 */
		Collections.sort(list, new Comparator<T>() {
			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		});
		return list.get(1);
	}

	public static <T extends Comparable> void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(2);
		System.out.println(secondSmallest(list));
	}
}
