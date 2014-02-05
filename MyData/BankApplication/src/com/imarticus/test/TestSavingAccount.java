package com.imarticus.test;

import com.imarticus.bank.BankAccount;
import com.imarticus.bank.SavingAccount;

public class TestSavingAccount {

	public static void main(String[] args) {
		SavingAccount account=new SavingAccount();
		System.out.println("Account No "+ account.getAccountNo() );
		System.out.println("Account name "+ account.getAccountHolderName());
		System.out.println(account.isSalaryAccount());
		
	}

}
