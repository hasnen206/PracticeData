package com.imarticus.test;

import com.imarticus.bank.BankAccount;

public class TestBankAccount {

	
	public static void main(String[] args) {
		BankAccount account=new BankAccount("Hasnen",5000);
		/*System.out.println("Account Holder name " + account.getAccountHolderName());
		System.out.println("Account no "+account.getAccountNo());
		System.out.println(account.getAccountBalance());
		account.withdraw(5000);
		account.setAccountHolderName("Sachin");
		System.out.println("Account Holder name " + account.getAccountHolderName());
		System.out.println(account.getAccountBalance());
		account.deposit(3000);
		System.out.println(account.getAccountBalance());
		System.out.println("==========");
		BankAccount account2=new BankAccount();
		System.out.println(account2.getAccountNo());*/
		System.out.println(account);
	}

}
