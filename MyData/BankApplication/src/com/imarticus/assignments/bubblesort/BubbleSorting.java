package com.imarticus.assignments.bubblesort;

public class BubbleSorting {
	
	public int[] getBubbleSort(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[j]>array[i])
				{
				int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		return array;
		
		
	}

}
