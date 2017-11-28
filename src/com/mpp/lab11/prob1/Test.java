package com.mpp.lab11.prob1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);

		/**
		 * Part-I The commented line gives error in compiler
		 */

		// List<Number> nums = ints;
		// nums.add(3.14);

		List<Integer> ints2 = new ArrayList<Integer>();
		ints2.add(1);
		ints2.add(2);
		/**
		 * Part-II The commented line gives error in compiler
		 */
		// List<? extends Number> nums2 = ints;
		// nums2.add(3.14);

	}

}
