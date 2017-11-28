package com.mpp.lab10.prob5.soln1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.mpp.lab10.prob5.Employee;

public class AsStringTest {

	/**
	 * return string with all verified employees
	 * 
	 * @param emps
	 * @return
	 */
	public static String asString(List<Employee> emps) {

		String empString = emps.stream().filter(e -> (e.getSalary() > 100000))
				.filter(e -> (e.getLastName().charAt(0) > 'M')).map(e -> fullName(e)).sorted()
				.collect(Collectors.joining(", "));

		return empString;
	}

	/**
	 * Print verified employees to console.
	 * 
	 * @param empList
	 */

	public static void printEmps(List<Employee> empList) {

		String s = asString(empList);
		System.out.println(s);

	}

	/**
	 * 
	 * @param e
	 * @return full name of employee
	 */
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

	@Test
	public void test() {

		List<Employee> empList = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("Alice", "Richards", 101000));
		assertEquals(asString(empList), "Alice Richards");

	}
}
