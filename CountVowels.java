// Complete the following program to count all vowels in a word

package com.corejava;

import java.util.Scanner;

public class CountVowels
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String word = in.next();
      int vowels = 0;
      for (int i = 0; i < word.length(); i++)
      {
         String ch = word.substring(i, i + 1);
         if ("aeiou".contains(ch))
         {
        	 vowels++;
         }
      }
      System.out.println("Vowels: " + vowels);
   }
}
