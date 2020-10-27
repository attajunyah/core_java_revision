/*
 * Consider the problem of replacing all straight quotes "like this" with curly quotes “like this” in a string. 
 * Before embarking on this task, let's think of a reusable method. Suppose we know where the straight quote is. 
 * Then we want to replace it. That would be useful in other situations too.
 * Your task is to complete the method replaceAt that replaces the character at a given position with an arbitrary string.
 */
package com.corejava;

public class Strings
{
   /**
      Replaces a character of a string at a given position.
      @param str the string where the replacement takes place
      @param position the position of the character to be replaced
      @param replacement the replacement string
      @return str with the character at the given position changed 
      to the replacement string, or the original string
      if the position was not valid.
   */
   public static String replaceAt(String str, int position,
      String replacement) 
   {
      if (0 <= position && position < str.length())
      {
         String before = str.substring(0, position);
         String after = str.substring(position + 1);
         return before + replacement + after;
      }
      else 
      {
         return str;
      }
   }
}