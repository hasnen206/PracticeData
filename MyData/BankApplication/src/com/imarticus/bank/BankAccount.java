package com.imarticus.bank;

public class BankAccount {
	
	
private int accountNo;
private String accountHolderName;
private double accountBalance;
private static int autoAccountNo;

static
{
	//jdbc code
	autoAccountNo=9;
}
{
	accountNo=++autoAccountNo;
}
public BankAccount(String accountHolderName,double accountBalance)
{
	
	this.accountHolderName=accountHolderName;
	setAccountBalance(accountBalance);
}
public BankAccount()
{
	
}

public void withdraw(double amount)
{
	setAccountBalance(getAccountBalance()-amount);
}
public void deposit(double amount)
{
	accountBalance+=amount;
	}
public double getAccountBalance()
{
	return accountBalance;
}
public int getAccountNo() {
	return accountNo;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
private void setAccountBalance(double accountBalance) {
	if(accountBalance<0)
	{
		System.out.println("Wrong Input");
	}
	else
	this.accountBalance = accountBalance;
}
@Override
public String toString() {
	return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
			+ accountHolderName + ", accountBalance=" + accountBalance + "]";
}



