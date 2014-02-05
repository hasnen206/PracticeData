package com.imarticus.assignments.incometax;

public class TaxSolving {

	public double getSalary(double salary)
	{	double temp=0;
	double taxsal=salary;
		double tax1=0.1;
		double tax2=0.2;
		double  tax3=0.3;
		double totaltax=0;
		
		 if(salary>=180001 && salary<=300000)
		{
			salary=-180000;
			
			salary*=tax1;
			totaltax=tax1;
			return totaltax;
		}
		else if(salary>=300001 && salary<=500000)
		{
			salary-=300000;
			
			taxsal*=tax1;
			salary*=tax2;
			return salary;
		}
		else if(salary>=500001 && salary<=1000000)
		{
			salary-=500000;
			taxsal=salary;
			taxsal*=tax3;
			tax1=120000*0.1;
			tax2=200000*0.2;
			taxsal+=tax1+tax2;
			return taxsal;
			
		}
		else 
			return 0;
	}
}
