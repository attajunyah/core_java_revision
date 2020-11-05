package com.corejava;

public class TextMax {

	public static void main(String[] args) {
		int first = 10;
		int second = 20; 
		int maximum = max(first, second);
		System.out.println("The maximum of " + first + " and " + second + " is " + maximum);

	}
	public static int max (int num1, int num2) {
		int result;
		if (num1 > num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		return result;
		
	}

}
