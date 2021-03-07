/*
 * Suppose we need to add support to the CashRegister class from the preceding 
 * problem to enable the cashier to quickly undo the preceding purchase that may 
 * have been entered incorrectly. This will require the use of a third instance 
 * variable to keep track of the previous purchase.
 * Complete the following class definition to implement this new feature.
 * The undo operation only undoes one purchase. It should have no effect 
 * after calling undo, giveChange, or clear.
 */

package com.corejava;

public class CashRegister {
	private int itemCount; 
	private double totalPrice;
	private double previous;
	
	/**
	 * Adds an item to this cash register.
	 * @param price the price of this item
	 */
	public void addItem(double price)
	{
		itemCount++;
		totalPrice = totalPrice + price;
		previous = price;		
	}
	
	/**
	 * Undo the last entry.
	 */
	public void undo()
	{
		if (previous != 0)
		{
			totalPrice = totalPrice - previous;
			itemCount--;
			previous = 0;
		}
	}
	
	/**
	 * Makes a payment modifying the totalPrice
	 * @param amount the amount paid.
	 */
	public void enterPayment(double amount)
	{
		totalPrice = totalPrice - amount;
	}
	
	/**
	 * Returns the change
	 * @return the change due
	 */
	public double giveChange()
	{
		double change = -totalPrice;
		totalPrice = 0;
		itemCount = 0;
		previous = 0;
		return change;
	}
	
	/**
	 * Clears the item count and the total.
	 */
	public void clear()
	{
		itemCount = 0;
		totalPrice = 0;
		previous = 0;
	}

}
