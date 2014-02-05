package com.imarticus.assignments;

import java.util.Scanner;

import com.imarticus.assignments.table.Table;
import com.imarticus.assignments.table.UI;

public class TableDisplay {

	
		public static void main(String args[]) 
		{
			Table logic=new Table();
			UI disp = new UI();
			int n=disp.getInput();
			for (int i = 1; i <= 10; i++) 
			{
				int table=logic.calculateTable(n, i);
				int square=logic.calculateSquare(table);
				disp.display(n, i, table, square);		
			}	
		}
		
	


