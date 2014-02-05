package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	 
	List A1=new ArrayList<Integer>();
	List B1=new ArrayList<Integer>();
	
	A1.add(1);
	A1.add(2);
	B1.add(A1);
	}
	
}
class A{
	public void paint(){
		System.out.println("hello");
	}
	public void art(){
		
	}
}
class B extends A{
	public void paint(){
		System.out.println("hello again");
	}
}


