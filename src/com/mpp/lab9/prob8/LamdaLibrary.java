package com.mpp.lab9.prob8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Predicate<Employee> , Integer> 
	triFunctionSalaryName = (empList,salary,isNameOkay) -> empList
			.stream()
			.filter(emp -> emp.salary > salary)
			.filter(emp -> isNameOkay.test(emp))
			.collect(Collectors.toList()).size() ;
	
	
	public static final TriFunction<List<Employee>, Integer, Predicate<Employee> , String> 
	triFunctionFullName = (empList,salary,isNameOkayBefore) -> empList
			.stream()
			.filter(emp -> emp.salary > salary)
			.filter(emp -> isNameOkayBefore.test(emp))
			.sorted((x,y) -> x.firstName.compareTo(y.firstName))
			.map(x -> x.firstName.toUpperCase()+ " "+ x.lastName.toUpperCase())
			.collect(Collectors.joining(",")) ;
}
