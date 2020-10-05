/*
In order to paint a wall that has a number of windows, we want to know its area. Each window has a size of 2 ft by 3 ft. Write a program that reads the width and height of the wall and the number of windows, using the prompts

Wall width:
Wall height:
Number of windows: 
Then print the area.
 */


package com.corejava;

//Import the Scanner class
import java.util.Scanner;

public class WallArea
{
	public static void main(String[] args)
	{
	   // Declare a scanner
	   Scanner in = new Scanner(System.in);
	
	   // Prompt for and read the width and height
	   System.out.print("Wall width: ");
	   double width = in.nextDouble();
	   System.out.print("Wall height: ");
	   double height = in.nextDouble();
	   // and the number of windows
	   System.out.print("Number of windows: ");
	   int numberOfWindows = in.nextInt();
	   // Compute the area of the windows on the wall
	   double windowsArea = 6.0;
	   // Compute the area of the wall without the windows
	   double area = width * height - (windowsArea * numberOfWindows);
	   System.out.println("Area: " + area);
	}
}