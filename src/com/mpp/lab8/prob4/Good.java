package com.mpp.lab8.prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();
		
		List<String> list = new ArrayList<>();
		list.add("cake");
		list.add("ballon");
		list.add("random");
		list.add("dominic");
		list.add("public");

		System.out.println(good.findRequiredLetter(list, 'c', 'd', 4));

	}

	public List<String> findRequiredLetter(List<String> list, Character has, Character hasnot, Integer len) {
		return list.stream() // convert list to stream
				.filter(name -> (name.contains("" + has)))
				.filter(name -> (!name.contains("" + hasnot)))
				.filter(name -> (name.length() == len))
				.collect(Collectors.toList()); // organizes
																						// into
																						// a
																						// list
	}
}
