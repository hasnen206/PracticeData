package com.imarticus.bank;

public class SavingAccount extends BankAccount {

	private boolean isSalaryAccount;
	
	public SavingAccount()
	{
		
	}
	public SavingAccount(String accountHolderName,double accountBalance)
	{
		super(accountHolderName,accountBalance);
	}
	public SavingAccount(String accountHolderName,double accountBalance,boolean isSalaryAccount)
	{
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=isSalaryAccount;
	}
	public boolean isSalaryAccount()
	{
		return isSalaryAccount;
	}
	public void withdraw(double amount)
	{
		super.withdraw(amount);
		System.out.println("Saving account method called");
	}
}
