package test;
import java.util.*;
public class TestRecords {

	
	public static void main(String[] args) {
		ArrayList testarray=new ArrayList();
		ArrayList result=new ArrayList();
		testarray.add(new int[]{5,7,8,16,12,13,19,25,2,1,27});
		result.add(new MaxMin(27,1));
		
		testarray.add(new int[]{10,5,78,45,71,3,45,98,14,35,47});
		result.add(new MaxMin(98,3));
		
		testarray.add(new int[]{1,2,3,4,5,6,7,8,9,10});
		result.add(new MaxMin(10,1));
		
		testarray.add(new int[]{10,9,8,7,6,5,4,3,2,1});
		result.add(new MaxMin(10,1));
		
		testarray.add(new int[]{1});
		result.add(new MaxMin(1,1));
		
		testarray.add(new int[]{1,2});
		result.add(new MaxMin(2,1));
		for(int i=0;i<testarray.size();i++)
		{MaxMin retvalue=MaxMinCalculator.getMaxMin((int[])testarray.get(i));
			if(retvalue.equals((MaxMin)result.get(i)))
			System.out.println("Pass");
			if(!retvalue.equals((MaxMin)result.get(i)))
				System.out.println("Fail");
		}
	}

}
