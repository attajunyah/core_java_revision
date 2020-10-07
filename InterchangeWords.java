/*
 * Complete this program so that it prints the given word with the first and last character interchanged. 
 * For example, if word is “tool”, then produce “loot”.


 */

package com.corejava;

import java.util.Scanner;

public class InterchangeWords
{
   public static void main(String[] args)
   {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.print("Enter a word: ");
	    String word = in.next();
	    
	    
	    int n = word.length();
	    word = word.charAt(n - 1) + word.substring(1, n - 1) + word.charAt(0);
	    
	    System.out.println(word);
   }
}