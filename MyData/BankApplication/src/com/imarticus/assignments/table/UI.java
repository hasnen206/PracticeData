package com.imarticus.assignments.table;

import java.util.Scanner;

public class UI {

	Scanner input=new Scanner(System.in);
	public int getInput()
	{
		System.out.println("Enter the no.");
		return (input.nextInt());
	}
	public void display(int n, int i, int table, int square)
	{
		System.out.println(n+" * "+i+" = "+ table+" ,Square = "+square);
		
	}
}
