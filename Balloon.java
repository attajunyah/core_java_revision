/*
 * Your task is to design a program that models inflating a spherical balloon. 
 * First the balloon is inflated to have a certain diameter (which is provided as an input). 
 * Then inflate the balloon so that the diameter grows by an inch, and display the amount the volume has grown. 
 * Repeat that step: grow the diameter by another inch and show the growth of the volume. Hint: The volume of a sphere is 
	4/3 πr^3.
 */

package com.corejava;

import java.util.Scanner;

public class Balloon
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Diameter: ");
      double diameter = in.nextDouble();

      // Compute growth of volume of the inflated balloon
      double volume1 = Math.PI * Math.pow(diameter, 3) / 6;
      diameter += 1;
      double volume2 = Math.PI * Math.pow(diameter, 3) / 6;
      double growth1 = volume2 - volume1;
      
      // Display the amount of grown volume
      System.out.printf("Increase: %.0f", + growth1 );
      System.out.println();
      
      
      // Compute growth of volume of the inflated balloon
      diameter += 1;
      double volume3 = Math.PI * Math.pow(diameter, 3) / 6;
      double growth2 = volume3 - volume2;
      
      // Display the amount of grown volume
      System.out.printf("Increase: %.0f", + growth2);
      System.out.println();
   }
}