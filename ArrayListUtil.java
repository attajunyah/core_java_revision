package com.corejava;

import java.util.ArrayList;

public class ArrayListUtil
{
   /**
      Finds the positions of all strings equal to a given string 
      in an array list of strings.
      @param words an array list of strings
      @param searchedWord the word to search for
      @return an array list of all matching positions
   */
   public static ArrayList<Integer> findAll(ArrayList<String> words, String searchedWord)
   {
	   ArrayList<Integer> pos = new ArrayList<Integer>();;
	   for(int i = 0; i < words.size(); i++)
	   {
		   String word = words.get(i);
		   if (searchedWord.equals(word))
		   {
			  pos.add(i);
		   }
		   
	   }
	   return pos;
      
   }
   
   /**
	   Gets all strings from an array list of a given length.
	   @param words an array list of strings
	   @param wordLength the length of the words to get
	   @return an array list with the words of length wordLength
	*/
	public static ArrayList<String> wordsOfLength(ArrayList<String> words, int wordLength)
	{
	   ArrayList<String> result = new ArrayList<String>();
	   for (int i = 0; i < words.size(); i++)
	   {
		   String word = words.get(i);
		   if (word.length() == wordLength)
		   {
			   result.add(words.get(i));
		   }
	   }
	   return result;
	}
   
   public static void main (String[] args)
   {
	   ArrayList<String> words = new ArrayList<String>();
	   words.add("How");
	   words.add("much");
	   words.add("wood");
	   words.add("would");
	   words.add("a");
	   words.add("wood");
	   words.add("chuck");
	   words.add("chuck");
	   words.add("if");
	   words.add("a");
	   words.add("wood");
	   words.add("chuck");
	   words.add("could");
	   words.add("chuck");
	   words.add("wood");
	   
	   
	   
	   System.out.println(findAll(words, "wood"));
	   
	   System.out.println(wordsOfLength(words, 5));
   }
}
