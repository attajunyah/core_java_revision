/*
 * Write a program that prints a countdown of the form

          10...9...8...7...6...5...4...3...2...1...0...Liftoff
 */

package com.corejava;

import java.util.Scanner;

public class Countdown
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int n = in.nextInt();

      for (int i = 0; i <= n; n--)
      {
    	  System.out.print(n + "...");
      }
      System.out.println("Liftoff");
   }
}