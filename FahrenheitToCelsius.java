package com.corejava;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			//Prompt the user for input
			System.out.print("Enter the value of x: ");
			double x = in.nextDouble();
			
			//functions of h, g, f
			double h = 4 * Math.pow(x, 3) - 7 * x;
			double g = 2 * Math.pow(x, 2) - 5 * x;
			double f = Math.pow(x, 2) - 4 * x + 4;
			
			System.out.println(h * g * f);
			System.out.println(g);
			System.out.println(f);
		}
	
	}

}



