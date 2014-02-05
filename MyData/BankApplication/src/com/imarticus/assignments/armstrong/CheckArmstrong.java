package com.imarticus.assignments.armstrong;



public class CheckArmstrong {

	public static void main(String[] args) {
		ArmCalc calc = new ArmCalc();
		// Scanner sc=new Scanner(System.in);
		for (int i = 100; i <= 153; i++) {
			System.out.println(calc.checkNumber(i));
		}
	}
}
