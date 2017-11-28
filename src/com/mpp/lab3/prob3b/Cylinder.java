package com.mpp.lab3.prob3b;

import com.mpp.lab3.prob3b.Circle;

public class Cylinder {

	Circle circle;
	double height;

	public Cylinder() {
	}

	public Cylinder(double radius) {
		circle = new Circle(radius);
	}

	public Cylinder(double radius, double h) {
		circle = new Circle(radius);
		this.height = h;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}

	public String toString() {

		return "Volume of cylinder is : " + getVolume();
	}

	public static void main(String[] args) {

		Cylinder cy = new Cylinder(22.3, 10);
		System.out.println(cy);

	}

}
