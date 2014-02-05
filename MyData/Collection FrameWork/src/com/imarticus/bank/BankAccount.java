package com.imarticus.bank;

public class BankAccount {

	private int accountNo=10;
	private String accountName;
	private double accountBalance;
	
	public BankAccount()
	{
		
	}

//	public BankAccount(int accountNo, String accountName, double accountBalance) {
//		super();
//		this.accountNo = accountNo;
//		this.accountName = accountName;
//		
//		this.accountBalance = accountBalance;
//	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName="
				+ accountName + ", accountBalance=" + accountBalance + "]";
	}
	
	public boolean equals(Object obj)
	{
		return this.accountNo==obj.hashCode();
	}
	public int hashCode()
	{
		return accountNo;
	}

}
