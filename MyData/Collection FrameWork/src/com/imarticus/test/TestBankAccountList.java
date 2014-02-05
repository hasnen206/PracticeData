package com.imarticus.test;

import java.util.Scanner;

import com.imarticus.bank.BankAccount;
import com.imarticus.collection.BankAccountList;
import com.imarticus.exception.InvalidAccountException;

public class TestBankAccountList {
public static void main(String[] args) {
	BankAccount account= new BankAccount(2000,"Onkar",40000);
	BankAccount account1= new BankAccount(2001,"Sachin",34000);
	BankAccount account2= new BankAccount(2002,"Rahul",56000);
	BankAccount account3= new BankAccount(2003,"mahesh",66000);
	BankAccount account4= new BankAccount(2004,"hitesh",72000);
	
	BankAccountList list=new BankAccountList(4);
	
	list.addBankAccount(account);
	list.addBankAccount(account1);
	list.addBankAccount(account2);
	list.addBankAccount(account3);
	list.addBankAccount(account4);
	
	list.showAllBankAccount();
	
	/*try {
		System.out.println(list.getBankAccount(2002));
	} catch (InvalidAccountException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	//list.deleteAllBankAccount();
	
	//System.out.println("Enter");
	//Scanner sc=new Scanner(System.in);
	//int accountno=sc.nextInt();
	//list.deleteBankAccount(accountno);
	//list.showAllBankAccount();
	//BankAccount account3= new BankAccount(2009,"Rahul",66000);
	//list.showAllBankAccount();
}
}
