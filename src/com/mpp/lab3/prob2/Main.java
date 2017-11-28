package com.mpp.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/**
		 * List of apartments with their rents
		 */
		List<Apartment> aList = new ArrayList<Apartment>();
		Apartment a1 = new Apartment(5000);
		Apartment a2 = new Apartment(4000);
		Apartment a3 = new Apartment(3000);
		aList.add(a1);
		aList.add(a2);
		aList.add(a3);

		/**
		 * List of building with apartments , here same apartments is used in
		 * all building
		 */
		List<Building> bList = new ArrayList<Building>();
		Building b1 = new Building(aList, 1000);
		Building b2 = new Building(aList, 2000);
		Building b3 = new Building(aList, 3000);
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);

		Main m = new Main();
		int monthlyProfit = m.getMonthlyProfit(bList);
		System.out.println("Total profit : " + monthlyProfit);
	}

	public int getMonthlyProfit(List<Building> bList) {

		int totalProfit = 0;
		for (Building building : bList) {
			totalProfit += building.getProfit();
		}
		return totalProfit;
	}

}
