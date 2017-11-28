package com.mpp.lab9.prob8;

import java.util.*;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// print the number of Employees in list whose salary > 100000 and whose
		// last name begins
		// with a letter that comes after the letter 'E'
		
		int count = LamdaLibrary.triFunctionSalaryName.apply(list, Integer.valueOf(100000), isNameOkay('E'));
		System.out.println("No. of Employee with given conditions : "+count);
		
		
		// print a list of sorted full names - all upper case -- of Employees
		// with
		// salary > 85000 and whose first name begins with a letter that comes
		// before the letter 'R'
		
		String result = LamdaLibrary.triFunctionFullName.apply(list, Integer.valueOf(85000), isNameOkayBefore('R'));
		System.out.println("Employee with given second conditions : \n"+result);
		

	}
	
	public static Predicate<Employee> isNameOkay(char c) {
        return p -> p.getLastName().charAt(0)> c ;
    }
	
	public static Predicate<Employee> isNameOkayBefore(char c) {
        return p -> p.getFirstName().charAt(0) < c ;
    }


}
