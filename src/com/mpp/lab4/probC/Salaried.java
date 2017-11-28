package com.mpp.lab4.probC;

public class Salaried extends Employee {

	private double salary;

	public Salaried(double salary) {
		this.salary = salary;
	}

	@Override
	public double calcGrossPay() {
		System.out.println("Abstract method from Salaried class is invoked....");
		return this.salary;
	}

}
