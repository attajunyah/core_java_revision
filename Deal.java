/*
 * Write a program that compares a list price and an actual price. 
 * Your program should print a single message. If the actual price is less than 50% of the list price, print “Great deal”.
 *  Otherwise, if the actual price is less than 80% of the list price, print “Good deal”. 
 *  If that is not the case but the actual price is no more than the list price, print “Ok deal”. If none of these apply, print “Bad deal”.
 */

package com.corejava;

import java.util.Scanner;

public class Deal {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("List price: ");
		double listPrice = in.nextDouble();
		System.out.print("Actual price: ");
		double actualPrice = in.nextDouble();
		
	    // You write the if/else statements
		if (actualPrice > listPrice )
		{
			System.out.println("Bad deal");
		}
		else if (actualPrice < 0.50 * listPrice)
		{
			System.out.println("Great deal");
		}
		else if (actualPrice < 0.80 * listPrice)
		{
			System.out.println("Good deal");
		}
		else if (actualPrice < listPrice || actualPrice == listPrice)
		{
			System.out.println("Ok deal");
		}          
	}

}
