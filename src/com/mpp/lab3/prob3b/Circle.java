package com.mpp.lab3.prob3b;

public class Circle {

	private double radius;
	private String color;

	/**
	 * Default constructor
	 */
	Circle() {

	}

	public Circle(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		return "Area of circle is : " + getArea();
	}

}
