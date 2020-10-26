/**
 * Implement a method shout that prints a line consisting of a string followed by three exclamation marks. 
 * For example, shout("Hello") should print Hello!!!. The function method not return a value.
 * In the main method, call shout twice, once for each input string.
 */

package com.corejava;

import java.util.Scanner;

public class ShoutDemo {
	public static void shout(String str) 
	{
		System.out.println(str + "!!!");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String input1 = in.nextLine();
		String input2 = in.nextLine();
		shout(input1);
		shout(input2);

	}

}
