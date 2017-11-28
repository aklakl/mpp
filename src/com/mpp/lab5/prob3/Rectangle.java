package com.mpp.lab5.prob3;

public class Rectangle implements Shape {

	private double length;
	private double width;

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

}
