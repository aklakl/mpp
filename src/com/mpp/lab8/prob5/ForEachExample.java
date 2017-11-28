package com.mpp.lab8.prob5;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");
		list.forEach(string -> System.out.println(string.toUpperCase()));
	}
}