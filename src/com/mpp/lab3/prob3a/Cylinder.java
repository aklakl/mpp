package com.mpp.lab3.prob3a;

public class Cylinder extends Circle {

	private double height;

	public Cylinder() {
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double h) {
		super(radius);
		this.height = h;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return super.getArea() * height;
	}
	
	public String toString(){
		
		return "Volume of cylinder is : "+getVolume();
	}
	
	
	public static void main(String[] args){
		
		Circle c = new Circle(22.3);
		System.out.println(c);
		
	    Circle cy = new Cylinder(22.3, 10);
	    System.out.println(cy);
		
		
	}
}
