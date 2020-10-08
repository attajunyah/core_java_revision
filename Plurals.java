/*
 * Computing the Plural of an English Word

 * The plural of apple is apples, but the plural of cherry is cherries. 
 * Generally, add an s to the end: apple - apples.
 * If the noun ends with ch, s, sh, x, or z, add es: bus - buses.
 * If the noun ends with a consonant + y, replace the y with ies: cherry - cherries.
 * There are several hundred irregular nouns that we don't consider: mouse - mice, ox - oxen etc. 
 * Let's stick to the previous three conditions in our algorithm.
 * 
 *  Test Cases 
 *  Test Case 1: Normal Case
 *  car, expected outcome: cars
 *  
 *  Test Case 2: Ends with "s"
 *  bus, expected outcome: buses
 *  
 *  Test Case 3: Ends with consonant + "y"
 *  ferry, expected outcome: ferries
 *  
 *  Test Case 4: Ends with vowel + "y"
 *  day, expected outcome: days
 *  
 *  Let's walk through the codes!

 */

package com.corejava;

import java.util.Scanner;

public class Plurals 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word which is singular: ");
		String word = in.next();
		
		
		int lastPos = word.length() - 1; // capture the last position of a word
		char last = word.charAt(lastPos); // capture the last character of a word
		char before = word.charAt(lastPos -1); // capture the character just before the last 
		
		// Let's find the plural through the conditions
		String plural;
		if (word.endsWith("ch") || word.endsWith("s") || word.endsWith("sh") ||
				word.endsWith("x") ||word.endsWith("z"))
		{
			plural = word + "es"; 
		}
		else if (! (before == 'a' || before == 'e' || before == 'i' ||  
				before == 'o' || before == 'u') && last == 'y') 
		// if word ends with y and a consonant before y
		{
			plural = word.substring(0, lastPos) + "ies"; // remove y and replace with ies 
		}
		else
		{
			plural = word + 's';
		}
		
		System.out.print("The plural of " + word + " is " + plural +".");
		plural = in.next();
		
	}
}
