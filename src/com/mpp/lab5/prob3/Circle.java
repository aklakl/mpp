package com.mpp.lab5.prob3;

public class Circle implements Shape {

	private double radius;

	public Circle(double r) {
		this.radius = r;

	}

	public double getLength() {
		return this.radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}
