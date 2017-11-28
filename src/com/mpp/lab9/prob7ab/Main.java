package com.mpp.lab9.prob7ab;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		
		/**
		 * This part is using stream directly (7a)
		 */

		String filteredList = list
				.stream()
				.filter(x -> x.salary > 100000)
				.filter(x -> x.lastName.charAt(0)>= 'N' && x.lastName.charAt(0) <= 'Z')
				.sorted((x,y) -> x.firstName.compareTo(y.firstName))
				.map(x -> x.firstName+" "+x.lastName)
				.collect(Collectors.joining(","));
		
		System.out.println(filteredList);
		
		/**
		 * This part is by using custom functional interface (7b)
		 */
		
		String filteredList2 = LambdaLibrary.triFunction.apply(list, 100000, isNameOkay('N','Z'));
		System.out.println(filteredList2);

	}
	
	public static Predicate<Employee> isNameOkay(char from,char to) {
        return p -> p.lastName.charAt(0)>= from && p.lastName.charAt(0) <= to;
    }


}