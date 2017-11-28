package com.mpp.lab4.probC;

public class Hourly extends Employee {

	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(double hourlyWage, double hoursPerWeek) {
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay() {
		/**
		 * Given 4 weeks makes a month
		 */
		System.out.println("Abstract method from Hourly class is invoked....");
		return hourlyWage * hoursPerWeek * 4;
	}

}
