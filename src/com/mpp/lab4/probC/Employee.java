package com.mpp.lab4.probC;

public abstract class Employee {

	private static final double FICA_TAX = 23;
	private static final double STATE_TAX = 5;
	private static final double LOCAL_TAX = 1;
	private static final double MEDICARE_TAX = 3;
	private static final double SOCIAL_SECURITY_TAX = 7.5;

	int empId;

	public void print() {

	}

	public PayCheck calcCompensation(int month, int year) {

		double grossPay = calcGrossPay();

		double fica = FICA_TAX * grossPay / 100;
		double state = STATE_TAX * grossPay / 100;
		double local = LOCAL_TAX * grossPay / 100;
		double medicare = MEDICARE_TAX * grossPay / 100;
		double socialSecurity = SOCIAL_SECURITY_TAX * grossPay / 100;

		return new PayCheck(grossPay, fica, state, local, medicare, socialSecurity);

	}

	public abstract double calcGrossPay();

}
