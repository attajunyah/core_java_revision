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

public class Tester {

	public static void main(String[] args) {
		CashRegister reg = new CashRegister();
		reg.addItem(12.50);
		reg.addItem(5.65);
		reg.addItem(7.23);
		reg.undo();
		reg.addItem(7.25);
		reg.enterPayment(20);
		reg.enterPayment(10);
		double change = reg.giveChange();
		System.out.printf("Change: %.2f%n",  change);
		System.out.println("Expected: 4.60");

	}

}
