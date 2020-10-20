package com.corejava;

public class FindArea {
	public static double rectangleArea (double width, double height)
	{
		double area = width * height;
		return area;
	}
	public static void main (String[] args)
	{
		double area1 = rectangleArea(2, 5);
		double area2 = rectangleArea(10, 10);
		
		System.out.println("The area of the first rectangle is " + area1);
		System.out.println("The area of the second rectangle is " + area2);
	}

}
