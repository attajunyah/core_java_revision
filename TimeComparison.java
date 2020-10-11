/*
 * Complete this program that reads the times for two events, such as 3 pm and 11 am. 
 * Determine whether the first event occurs before the second event, at the same time, or after the second event. 
 * Print "Before", "Same", or "After".
 */

package com.corejava;

import java.util.Scanner;

public class TimeComparison
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // Reads in two event times, such as 11 am or 3 pm
      System.out.print("First time: ");
      int time1 = in.nextInt();
      String suffix1 = in.next();
      System.out.print("Second time: ");
      int time2 = in.nextInt();
      String suffix2 = in.next();

      /* Compare the two times and determine whether the 
       first event occurs before the second event, at the same time,
       or after the second event

       Print "Before", "Same", or "After"
      
      */
      if (suffix1.equals(suffix2))
      {
    	  
         if (time1 < time2)
         {
            System.out.println("Before");        
         }
         else if (time1 == time2)
         {
            System.out.println("Same");        
         }
         else
         {
            System.out.println("After");        
         }
         
      }
      
      else if (suffix1.equals("am"))
      {
         System.out.println("Before");        
      }
      else
      {
         System.out.println("After");        
      }
      
      
      

   }
}
