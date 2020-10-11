/*
 * Modify the following program so that it terminates, 
 * printing "Invalid input" as soon as an invalid input is detected. 
 * If both inputs are valid, print their product.
 */

package com.corejava;
import java.util.Scanner;

public class ValidateInput {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		if (in.hasNextInt())
		{
			int m = in.nextInt();
			System.out.print("Enter another integer: ");
			if (in.hasNextInt())
			{
				int n = in.nextInt();
				System.out.println("Inputs are valid. Hence:");
				System.out.println("Product: " + m * n);
			}
			else 
			{
				System.out.println("Invalid second input");
			}
		}
		else 
		{
			System.out.println("Invalid first input");
		}
	      
		
		
	}

}
