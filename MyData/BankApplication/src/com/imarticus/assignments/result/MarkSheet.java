package com.imarticus.assignments.result;

import java.util.Scanner;

public class MarkSheet {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Subject Marks");
		int subject1=sc.nextInt();
		int subject2=sc.nextInt();
		int subject3=sc.nextInt();
		if(new ResultProvider().resultProvider(subject1, subject2, subject3))
		{
			System.out.println("Passed");
		}
		else
			System.out.println("Failed");
	}

}
