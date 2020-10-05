package com.corejava;
import java.util.Scanner;

public class DisplayDay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// input today's integer
		System.out.print("Enter m: ");
		int m = input.nextInt();
		//input additional days added
		System.out.print("Enter r: ");
		int r = input.nextInt();
		
		// display results
		System.out.println(Math.pow((m * r), 2));
	
	}

}
