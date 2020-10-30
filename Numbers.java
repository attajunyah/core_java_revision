/*
 * Write an enhanced for loop that multiplies all elements in an int[] array named factors, accumulating the result in a variable named product.
 */

package com.corejava;

public class Numbers
{
   public int multiply(int[] factors)
   {
      int product = 1;
      for (int element : factors)
      {
         product = element * product;
      }
      return product;
   }
}