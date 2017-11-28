package com.mpp.lab4.probC;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	List<Order> orderList;

	public Commissioned(double commission, double baseSalary, List<Order> orders) {
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orderList = (orders != null)?orders:new ArrayList<Order>();
	}

	@Override
	public double calcGrossPay() {
		System.out.println("Abstract method from Commissioned class is invoked....");

		double totalOrdervalue = 0.0;
		for (Order order : orderList) {
			totalOrdervalue += order.getOrderAmount();
		}
		double totalGrossPay = (commission / 100) * totalOrdervalue;

		return totalGrossPay + baseSalary;
	}

}
