package com.corejava;

/**
This program prints strings in boxes.
*/
public class Boxes
{
public static void main(String[] args)
{
   boxString("Hello");
   boxString("World");
}

/**
   Prints a string in a box.
   @param contents the string to print in a box
*/
public static void boxString(String contents)
{
   int n = contents.length();
   // Print the top row
   for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
   System.out.println();
   System.out.println("!" + contents + "!");
   // Print the bottom row
   for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
   System.out.println();
}
}