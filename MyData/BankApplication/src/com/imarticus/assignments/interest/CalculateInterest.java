package com.imarticus.assignments.interest;

public class CalculateInterest {

	public double simpleInterest(double principle,float rate,int year)
	{
		double simpleInt=0;
		simpleInt=principle*rate*year;
		simpleInt=simpleInt/100;
		
		return simpleInt;
	}
	public double coumpoundInterest(double principle,float rate,int year)
	{double compInt=0;
		rate=rate/100;
		compInt=(1+rate);
		for(int i=1;i<year;i++)
		{
			compInt*=compInt;
		}
	
		compInt*=principle;
		
		return compInt-principle;
	}
}
