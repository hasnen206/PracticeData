package com.imarticus.savingacc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		
		TreeSet<SavingAccount> set=new TreeSet();
		
		SavingAccount account1=new SavingAccount(1,"Raj",30000,true);
		SavingAccount account2=new SavingAccount(2,"Hasnen",40000,true);
		SavingAccount account3=new SavingAccount(3,"Ajay",50000,true);
		SavingAccount account4=new SavingAccount(4,"Vijay",60000,true);
		
		set.add(account1);
		set.add(account2);
		set.add(account3);
		set.add(account4);
		
		for(SavingAccount acc:set)
		{
			System.out.println(acc);
		}
		
	}
}