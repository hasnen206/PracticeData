package Binarytest;

import java.util.ArrayList;
import java.util.Scanner;

public class TestRecords {
	public static void main(String args[])
	{
	int []arraydata={3,4,6,8,9,12,23,45,66,89,90,91,123};
	ArrayList testCaseList=new ArrayList();
	testCaseList.add(23);
	testCaseList.add(3);
	testCaseList.add(123);
	testCaseList.add(45);
	
	ArrayList testCasePosition=new ArrayList();
	testCasePosition.add(6);
	testCasePosition.add(0);
	testCasePosition.add(12);
	testCasePosition.add(7);
	
	
	for(int i=0;i<4;i++)
	{
		if(Binary.Search(arraydata,(int)testCaseList.get(i))==(int)testCasePosition.get(i))
		Hasnen.out.println("Passed");
	
	else 
	
		Hasnen.out.println("failed");
	}
	}
}