/* 
 * When the provided integer n is divisible by 3, print fizz. When the provided integer is divisible by 5, print buzz.
 *  When it is divisible by both 3 and 5, print fizzbuzz. Otherwise print the integer.

You need to fill in a condition (using Boolean operators) for each of the four cases.
 */


package com.corejava;

import java.util.Scanner;

public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int n = in.nextInt();
		if (n % 3 == 0 && n % 5 != 0)
		{
			System.out.println("fizz");
		}
		if (n % 5 == 0 && n % 3 != 0)
		{
			System.out.println("buzz");
		}
		if ((n % 3 == 0) && (n % 5 == 0))
		{
			System.out.println("fizzbuzz");
		}		
		if (!(n % 3 == 0 || n % 5 == 0))
		{
			System.out.println(n);
		}
		
	}
	
}
