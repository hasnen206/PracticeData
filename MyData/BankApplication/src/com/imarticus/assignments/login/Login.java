package com.imarticus.assignments.login;

import java.util.Scanner;

public class Login {

	
	public static void main(String[] args) {
		
		int attempt=0;
			String name="hasnen";
			String password="dawood";
			LoginPage lp=new LoginPage(name, password);
		
		while(attempt!=3)
		{System.out.println("Enter name");
		Scanner sc=new Scanner(System.in);
		String name1=sc.next();
		System.out.println("Enter password");
		String password1=sc.next();
			
		if(lp.checkValidation(name1, password1))
		{
			System.out.println("Welcome");
			break;
		}
		
		else
		{
			System.out.println("wrong");
			if(attempt==2)
				System.out.println("ContactAdmin");
			attempt++;
		}
	}
	}
}
