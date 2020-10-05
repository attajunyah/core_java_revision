package com.corejava;
import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input 
		
		System.out.print("Enter an integer for seconds: ");
		
		// Read an integer
		int seconds = input.nextInt();
		
		// Convert minutes to seconds 
		int minutes = seconds / 60;
		
		// Check for remaining seconds 
		int remainingSeconds = seconds % 60;
		
		// Print results
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");  
		

	}

}
