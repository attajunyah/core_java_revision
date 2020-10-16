/* 
 * Implement a program that Print the string s in reverse order;
 */

package com.corejava;

import java.util.Scanner;

public class Reverse
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word: ");

      /* Implement this pseudocode:
		s = Read user input
		r = ""        
		i = 0        
		while i < length of s
		   c = ith character of s
		   r = c + r
		   i++
		Print r  
      */
      
      String s = in.next();
      String r = "";
      int i = 0;
      
      while (i < s.length())
      {
    	  char c = s.charAt(i);
    	  r = c + r;
    	  i++;
      }
      System.out.println(r);
   }
}