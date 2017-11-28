package com.mpp.lab5.prob3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle : ");
		double rLen = s.nextDouble();
		System.out.println("Enter the width of Rectangle : ");
		double rWid = s.nextDouble();
		Shape rectangle = new Rectangle(rLen, rWid);

		System.out.println("Enter the base of Triangle : ");
		double tBase = s.nextDouble();
		System.out.println("Enter the height of Triangle : ");
		double tHeight = s.nextDouble();
		Shape triangle = new Triangle(tBase, tHeight);

		System.out.println("Enter the radius of Circle : ");
		double radius = s.nextDouble();
		Shape circle = new Circle(radius);

		Shape[] shapes = { rectangle, triangle, circle };

		double totalArea = 0;

		for (Shape shape : shapes) {
			totalArea += shape.calculateArea();
		}
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Sum of Areas = "+df.format(totalArea));

	}

}
