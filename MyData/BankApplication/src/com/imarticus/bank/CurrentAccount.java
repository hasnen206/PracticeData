package com.imarticus.bank;

public class CurrentAccount extends BankAccount  {
	private final double ODLimit;
	

		
	

public CurrentAccount(String accountHolderName,double accountBalance,int ODlimit)
{super(accountHolderName,accountBalance);
	this.ODLimit=ODlimit;
	
}

public void withdraw(double amount)
{
	super.withdraw(amount);
	System.out.println("Current account method called");
}
}
