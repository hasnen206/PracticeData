package com.imarticus.assignments.studentaverage;

import java.util.Scanner;

public class TestStudent {

	
	public static void main(String[] args) {
		System.out.println("A-->Enter your three marks");
		Scanner sc=new Scanner(System.in);
		int marks11=sc.nextInt();
		int marks12=sc.nextInt();
		int marks13=sc.nextInt();
		System.out.println("B-->Enter your three marks");
		int marks21=sc.nextInt();
		int marks22=sc.nextInt();
		int marks23=sc.nextInt();
		System.out.println("C-->Enter your three marks");
		int marks31=sc.nextInt();
		int marks32=sc.nextInt();
		int marks33=sc.nextInt();
		MyStudent student1=new MyStudent(marks11, marks12, marks13);
		MyStudent student2=new MyStudent(marks21, marks22, marks23);
		MyStudent student3=new MyStudent(marks31, marks32, marks33);
		TotalMarks t1=new TotalMarks();
		t1.studentsTotal(student1,student2,student3);
		t1.DisplayA();
		t1.DisplayB();
		t1.DisplayC();

	}

}
