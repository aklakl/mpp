package com.mpp.lab10.prob5.soln2;

import java.util.List;
import java.util.stream.Collectors;

import com.mpp.lab10.prob5.Employee;

public class AsStringTestSol2 {

	/**
	 * return string with all verified employees
	 * 
	 * @param emps
	 * @return
	 */
	public static String asString(List<Employee> emps) {

		String empString = emps.stream()
				.filter(e -> salaryGreaterThan100000(e))
				.filter(e -> lastNameAfterM(e))
				.map(e -> fullName(e))
				.sorted()
				.collect(Collectors.joining(", "));

		return empString;
	}

	public static boolean salaryGreaterThan100000(Employee e) {
		return e.getSalary() > 10000;
	}

	public static boolean lastNameAfterM(Employee e) {
		return e.getLastName().charAt(0) > 'M';
	}

	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
