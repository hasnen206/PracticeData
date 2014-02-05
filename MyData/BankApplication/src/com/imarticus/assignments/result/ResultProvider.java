package com.imarticus.assignments.result;

public class ResultProvider {

	public boolean resultProvider(int subject1,int subject2,int subject3)
	{
	if(isGreaterThan60(subject1)&& isGreaterThan60(subject2)&& isGreaterThan60(subject3))
	{
		return true;
	}
	if((isGreaterThan60(subject1)&&isGreaterThan60(subject2))||(isGreaterThan60(subject1)&&isGreaterThan60(subject3))||(isGreaterThan60(subject2)&&isGreaterThan60(subject3)))
	{
		return true;
	}
	
	else
	return false;
	}
	public boolean isGreaterThan60(int subject)
	{
		if(subject>=60)
		{
			return true;
		}
		else
			return false;
	}
	public boolean isLessThan60(int subject)
	{
		if(subject<60)
		{
			return true;
		}
		else 
			return false; 
	}
}
