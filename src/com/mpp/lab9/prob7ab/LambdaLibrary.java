package com.mpp.lab9.prob7ab;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Predicate<Employee> , String> 
	triFunction = (empList,salary,isNameOkay) -> empList
			.stream()
			.filter(emp -> emp.salary > salary)
			.filter(emp -> isNameOkay.test(emp))
			.sorted((emp,emp2) -> emp.firstName.compareTo(emp2.firstName))
			.map(x -> x.firstName+" "+x.lastName)
			.collect(Collectors.joining(",")) ;

}
