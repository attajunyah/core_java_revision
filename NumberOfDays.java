package com.corejava;

import java.util.Scanner;

/**
 * In the following program, declare an integer array daysInMonth that stores the
 * number of days in January, February, March, April, and so on. Fill it with the appropriate values (31, 28, 31, 30, ...).
 * The program reads a month and year from the user.
 * When the year is a leap year, change the entry for February to 29.
 * Print out how many days the given month has.
 * @author kai
 *
 */
public class NumberOfDays
{
   public static void main(String[] args)
   {
      // Declare and initialize daysOfMonth
      int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      Scanner in = new Scanner(System.in);
      System.out.print("Month (1 - 12): ");
      int month = in.nextInt();
      System.out.print("Year: ");
      int year = in.nextInt();
      
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
         // It's a leap year. Adjust the entry for February
         daysOfMonth[1] = 29;
      }

      // Get the number of days in the given month
      int days = daysOfMonth[month - 1];

      System.out.println("Number of days: " + days);               
   }
}