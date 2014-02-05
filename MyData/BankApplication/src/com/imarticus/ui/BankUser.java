package com.imarticus.ui;

import java.util.Scanner;

import javax.xml.soap.SAAJResult;

import com.imarticus.bank.BankAccount;
import com.imarticus.bank.CurrentAccount;
import com.imarticus.bank.SavingAccount;

public class BankUser {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter 1 for Saving Account or 2 for Current Account");
	int bankAccountchoice=sc.nextInt();
	BankAccount account=null;
	switch (bankAccountchoice) {
	case 1:
		account=new SavingAccount("Onkar",5000,true);
		break;
	case 2:
		account=new CurrentAccount("Onkar",10000,3000);
		break;
	default:
		break;
	}
	System.out.println("Enter the amount to be withdrawn");
	double amount;
	amount=sc.nextDouble();
	account.withdraw(amount);
	System.out.println(account.getAccountBalance());
	
	}

}
