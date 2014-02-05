package com.imarticus.assignments.interest;

import java.util.Scanner;

public class testInterest {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		double principle=sc.nextDouble();
		System.out.println("Enter year");
		int year=sc.nextInt();
		System.out.println("Enter rate");
		float rate=sc.nextFloat();
		System.out.println("Simple Interest: "+new CalculateInterest().simpleInterest(principle, rate, year));
         System.out.println();
		System.out.println("Coumpond Interest: "+ new CalculateInterest().coumpoundInterest(principle, rate, year));
	}

}
