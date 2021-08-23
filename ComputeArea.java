package com.corejava;

public class ComputeArea {
	public static void main (String[] args) {
		final double PI = 3.14159; // Declare a constant
		
		// declare an int constant SIZE with value 20
		//final int SIZE = 20;
		
		 double miles = 100;
		 final double KILOMETERS_PER_MILE = 1.609;
		 double kilometers = miles * KILOMETERS_PER_MILE;
		 System.out.println(kilometers);
		 
		// Declare radius and area as variables
		double radius;
		double area;
		
		// Step 1: Read in radius 
		radius = 20;
		
		// Step 2: Compute area with formula 
		area = radius * radius * PI;
		
		// Display result
		System.out.println("The area is " + area);
	}

}
