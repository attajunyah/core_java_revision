/* 
 * Read in a time such as 3 pm and print the equivalent military hour (such as 15). Validate the input.

	* If the input doesn’t start with an integer, print: Error: Not an integer.
	* If the number isn’t between 1 and 12, print: Error: The hour must be between 1 and 12.
	* If the suffix isn’t "am" or "pm", print: Error: The suffix must be am or pm.
 */

package com.corejava;

import java.util.Scanner;

public class TimeReader
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter integer: ");
      if (in.hasNextInt())
      {
    	 
         int hour = in.nextInt();
         if (hour > 1 && hour <= 12)
         {
        	System.out.print("Enter suffix: "); 
            String suffix = in.next();
            if (suffix.equals("am") || suffix.equals("pm"))
            {
               // Convert hour to military time
            	if (hour == 12 && suffix.equals("pm")) 
            	{
            		System.out.println(hour - 0);
            	}
            	else if (hour == 12 && suffix.equals("am")) 
            	{
            	   System.out.println(hour - 12);
            	}
            	else if (suffix.equals("pm"))
            	{
            	   System.out.println(hour + 12);
            	}
            	else 
            	{
            		System.out.println(hour);
            	}
               
            }
            else 
            {
               System.out.println("Error: The suffix must be am or pm.");
            }
         }
         else 
         {
            System.out.println("Error: The hour must be between 1 and 12.");
         }
      }
      else 
      {
         System.out.println("Error: Not an integer.");
      }
   }
}