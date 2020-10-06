package com.corejava;

import java.util.Scanner;

/**
   This program simulates a vending machine that gives change.
   Problem Statement Suppose you are asked to write a program that simulates a vending machine. 
   A customer selects an item for purchase and inserts a bill into the vending machine. 
   The vending machine dispenses the purchased item and gives change. 
   We will assume that all item prices are multiples of 25 cents, and the machine gives all change in dollar coins and quarters.
   Your task is to compute how many coins of each type to return.
*/
public class VendingMachine
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final int PENNIES_PER_DOLLAR = 100;
      final int PENNIES_PER_QUARTER = 25;

      System.out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
      int billValue = in.nextInt();
      System.out.print("Enter item price in pennies: ");
      int itemPrice = in.nextInt();

      // Compute change due

      int changeDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
      int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
      changeDue = changeDue % PENNIES_PER_DOLLAR;
      int quarters = changeDue / PENNIES_PER_QUARTER;

      // Print change due
      
      System.out.printf("Dollar coins: %6d", dollarCoins);
      System.out.println();
      System.out.printf("Quarters:     %6d", quarters);
      System.out.println();
   }
}
