package com.corejava;

import java.util.Scanner;

public class HelperMethods {
	/**
	 * Gets the number of spaces in a string
	 * @param str any string
	 * @return the number of spaces in str
	 */
	
	//Implement the method here
	public static int countSpaces(String str)
   	{
		int spaces = 0;
		for (int i = 0; i < str.length(); i++) 
		{
         if (str.charAt(i) == ' ') { spaces++; }
		}
		return spaces;
   	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input sentence: ");
		String line = in.nextLine();
		System.out.println(countSpaces(line));
		

	}

}
