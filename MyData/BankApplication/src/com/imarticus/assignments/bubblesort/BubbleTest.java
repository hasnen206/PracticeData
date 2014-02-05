package com.imarticus.assignments.bubblesort;

public class BubbleTest {

	
	public static void main(String[] args) {
		BubbleSorting bubble=new BubbleSorting();
		int array[]={5,12,14,6,8,19,1,23,26,35,37,7,52,86,47};
		int array1[]=bubble.getBubbleSort(array);
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
	}
	

}
