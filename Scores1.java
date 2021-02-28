package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

/**
   This program computes a final score for a series of quiz scores: the sum 
   after dropping the lowest score.
*/
public class Scores1
{
   public static void main(String[] args)
   {
      ArrayList<Double> scores = readInputs();
      if (scores.size() == 0)
      {
         System.out.println("At least one score is required.");
      }
      else
      {
         double total = sum(scores) - minimum(scores);
         System.out.println("Final score: " + total);
      }
   }

   /**
      Reads a sequence of floating-point numbers.
      @return an ArrayList containing the numbers
   */
   public static ArrayList<Double> readInputs()
   {
      ArrayList<Double> inputs = new ArrayList<Double>();
      System.out.println("Please enter values, Q to quit:");
      Scanner in = new Scanner(System.in);
      while (in.hasNextDouble())
      {  
         inputs.add(in.nextDouble());
      }
      return inputs;
   }
   
   /**
      Computes the sum of the values in an array list.
      @param values an array list
      @return the sum of the values in values
   */
   public static double sum(ArrayList<Double> values)
   {
      double total = 0;
      for (double element : values)
      {
         total = total + element;
      }
      return total;
   }
      
   /**
      Gets the minimum value from an ArrayList.
      @param values an ArrayList of size >= 1
      @return the smallest element of values
   */
   public static double minimum(ArrayList<Double> values)
   {
      double smallest = values.get(0);
      for (int i = 1; i < values.size(); i++)
      {
         if (values.get(i) < smallest)
         {
            smallest = values.get(i);
         }
      }
      return smallest;
   }
}