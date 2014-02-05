package test;

import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {

	
	public static void main(String[] args) throws IOException{
		int a[]={23,8,15,19,27,12,32,16,54,9};
		
		int i=0  ;
		
		 	
		for(i=0;i<a.length;i++)
		{
				for(int j=0;j<a.length;j++)
				{
					if(a[j]>a[i])
					{
						int t=a[j];
						a[j]=a[i];
						a[i]=t;			

					}
				}
		}
		for(i=0;i<a.length;i++)
			{if(a[i]==a[0])
			System.out.println(a[i]+"<---Smaller");
			if(a[i]==a[9])
			System.out.println(a[i]+"<---Greater");
			else
			System.out.println(a[i]);
			}
	}

}
