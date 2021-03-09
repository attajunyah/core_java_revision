package com.corejava;

/**
A simulated lock with digit buttons.
*/
public class Lock
{
	private int combination = 1729; 
	private int input;
	
	/**
	   Simulates a digit button push.
	   @param button a digit 0 ... 9
	*/
	public void push(int button)
	{
	   input = 10 * input + button;
	}
	
	/**
	   Simulates a push of the open button.
	   @return true if the lock opened
	*/
	public boolean open()
	{
	   if (combination == input)
	   {
	      input = 0;
	      return true;
	   }
	   else 
	   {
	      input = 0;
	      return false;
	   }
	}
}