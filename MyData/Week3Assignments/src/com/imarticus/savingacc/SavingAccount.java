package com.imarticus.savingacc;

public class SavingAccount implements Comparable<SavingAccount> {
	private int accountID;
	private String accountHoldername;
	private double accBalance;
	boolean isSalaryAcc;
	
	
	public SavingAccount(int accountID, String accountHoldername,
			double accBalance, boolean isSalaryAcc) {
		super();
		this.accountID = accountID;
		this.accountHoldername = accountHoldername;
		this.accBalance = accBalance;
		this.isSalaryAcc = isSalaryAcc;
	}


	public int getAccountID() {
		return accountID;
	}


	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


	public String getAccountHoldername() {
		return accountHoldername;
	}


	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}


	public double getAccBalance() {
		return accBalance;
	}


	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}


	public boolean isSalaryAcc() {
		return isSalaryAcc;
	}


	public void setSalaryAcc(boolean isSalaryAcc) {
		this.isSalaryAcc = isSalaryAcc;
	}
	
	public void deposit(double amount)
	{
		
	}
	
	public void withdraw(double amount)
	{
		
	}


	@Override
	public String toString() {
		return "SavingAccount [accountID=" + accountID + ", accountHoldername="
				+ accountHoldername + ", accBalance=" + accBalance
				+ ", isSalaryAcc=" + isSalaryAcc + "]";
	}


	@Override
	public int compareTo(SavingAccount o) {
		return accountID-o.accountID;
		
	}
	
	
	
}
