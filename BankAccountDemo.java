package com.corejava;

public class BankAccountDemo {
	private double balance;
	
	public BankAccountDemo()
	{
		balance = 0;
	}
	
	public BankAccountDemo(double initialBalance)
	{
		balance = balance + initialBalance;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public double getBalance()
	{
		return balance;
	}

}
