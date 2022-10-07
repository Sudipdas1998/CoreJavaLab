package com.demo;

import java.util.Scanner;

public class Area {

	public static double RectangleArea(double length, double breadth) {
		return length * breadth;
	}

	public static double SquareArea(double side) {
		return side * side;

	}

	public static double CircleArea(double radius) {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of Rectangle");
		double length = sc.nextDouble();

		System.out.println("Enter the breadth of Rectangle");
		double breadth = sc.nextDouble();

		System.out.println("Entre the side of sqare");
		double side = sc.nextDouble();

		System.out.println("Entre the radius of circle");
		double radius = sc.nextDouble();

		double areaofrectangle = RectangleArea(length, breadth);
		System.out.println("The Area of Rectangle is:" + areaofrectangle);

		double areaofsquare = SquareArea(side);
		System.out.println("The area of square is:" + areaofsquare);

		double areaofcircle = CircleArea(radius);
		System.out.println("The area of circle is:" + areaofcircle);
	}

}
