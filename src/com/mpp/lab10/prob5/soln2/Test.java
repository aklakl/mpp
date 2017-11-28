package com.mpp.lab10.prob5.soln2;

import static org.junit.Assert.assertTrue;

import com.mpp.lab10.prob5.Employee;

public class Test {

	@org.junit.Test
	public void testSalary() {
		assertTrue(AsStringTestSol2.salaryGreaterThan100000(new Employee("John", "Sims", 110000)));
	}
	
	@org.junit.Test
	public void testLastName(){
		assertTrue(AsStringTestSol2.lastNameAfterM(new Employee("John", "Sims", 1100)));
	}

}
