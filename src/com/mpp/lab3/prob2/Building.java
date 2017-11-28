package com.mpp.lab3.prob2;

import java.util.List;

public class Building {

	List<Apartment> apartments;
	int maintenanceCost;

	public Building(List<Apartment> aparts, int mCost) {

		this.apartments = aparts;
		this.maintenanceCost = mCost;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}

	public int getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(int maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public int getProfit() {
		int buildingProfit = 0;
		for (Apartment apartment : apartments) {
			buildingProfit += apartment.getRent();
		}
		return buildingProfit - maintenanceCost;
	}

}
