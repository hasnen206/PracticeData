package com.imarticus.collection;

import com.imarticus.bank.BankAccount;
import com.imarticus.exception.InvalidAccountException;

public class BankAccountList {
	
	BankAccount []accounts=null;
	private int pointer=-1;
	
	public BankAccountList(int size)
	{
		accounts= new BankAccount[size];
	}
	
	public void addBankAccount(BankAccount account)
	{ 
		if(pointer+1==accounts.length)
		{
			int size=accounts.length;
			size+=size;
		    	BankAccount temp[]=new BankAccount[size];
				System.arraycopy(accounts,0, temp,0,accounts.length);
			
			accounts=new BankAccount[size];
			System.arraycopy(temp,0,accounts,0,temp.length);
			accounts[++pointer]=account;
			
		}
		else
		accounts[++pointer]=account;
	}
	
	public void showAllBankAccount()
	{
		for(BankAccount account:accounts)
		{
			System.out.println(account);
		}
	}
	public BankAccount getBankAccount(int accountNo) throws InvalidAccountException
	{
		for(BankAccount account:accounts)
		{
			if(account.getAccountNo()==accountNo)
			{
				return account;
			}
		}
		throw new InvalidAccountException();
	}
	
	public void deleteBankAccount(int accountNo)
	{
		
			for(int i=0;i<pointer;i++)
			{
				
					if(accounts[i].getAccountNo()==accountNo)
					{
						
						accounts[i]=null;
					}	
					for(int j=0;j<pointer;j++)
					{
						if(accounts[pointer]!=null)
						{
							if(accounts[j]==null)
							{
								accounts[j]=accounts[++j];
								accounts[j--]=null;
							}
						}
					}
			}
			pointer--;
			
	}
	
	public void deleteAllBankAccount()
	{	for(int i=0;i<=pointer;i++)
		accounts[i]=null;

	}
}
