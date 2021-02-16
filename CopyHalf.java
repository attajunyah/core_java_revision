package com.corejava;
import java.util.Arrays;

/**
 * Complete the following code to make a copy of the first half of an array of strings.
 * @author Mickey
 *
 */
public class CopyHalf
{
   /**
      Copies the first half of an array. If the length is odd, 
      don't copy the middle value.
      @param values an array
      @return a copy of the first half of values
   */
   public static String[] copyHalf(String[] values)
   {
      
      String[] newHalf = new String[values.length/2];
      for (int i = 0; i < newHalf.length && i < values.length; i++) 
      { 
         newHalf[i] = values[i]; 
      }
      return newHalf;
      
   }
   public static void main (String[] args)
   {
	   String[] example1 = new String[] {"Mary", "is",  "a", "good", "girl"};
	   String[] example2 = new String[] {"its", "fleece", "was", "white", "as", "snow"};
	   
	   System.out.println("The copy of half the strings are: " + Arrays.toString(copyHalf(example1)));
	   System.out.println("The copy of half the strings are: " + Arrays.toString(copyHalf(example2)));
   }
}