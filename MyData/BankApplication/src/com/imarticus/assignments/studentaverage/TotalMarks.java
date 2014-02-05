package com.imarticus.assignments.studentaverage;

public class TotalMarks {
	
	int totalmarksofA=0;
	int totalmarksofB=0;
	int totalmarksofC=0;
	float avgmarksA=0;
	float avgmarksB=0;
	float avgmarksC=0;
	public void studentsTotal(MyStudent Amarks,MyStudent Bmarks,MyStudent Cmarks)
	{
		int marks11=Amarks.marks1;
		int marks12=Amarks.marks2;
		int marks13=Amarks.marks3;
		int marks21=Bmarks.marks1;
		int marks22=Bmarks.marks2;
		int marks23=Bmarks.marks3;
		int marks31=Cmarks.marks1;
		int marks32=Cmarks.marks2;
		int marks33=Cmarks.marks3;
		
		totalmarksofA=marks11+marks12+marks13;
		totalmarksofB=marks21+marks22+marks23;
		totalmarksofC=marks31+marks32+marks33;
		
		avgmarksA=totalmarksofA/3;
		avgmarksB=totalmarksofB/3;
		avgmarksC=totalmarksofC/3;
		
		
	}
	public void DisplayA()
	{
		System.out.println("Total: "+ totalmarksofA+" Average: "+ avgmarksA);
	}
	public void DisplayB()
	{
		System.out.println("Total: "+ totalmarksofB+" Average: "+ avgmarksB);
	}
	public void DisplayC()
	{
		System.out.println("Total: "+ totalmarksofC+" Average: "+ avgmarksC);
	}
}
