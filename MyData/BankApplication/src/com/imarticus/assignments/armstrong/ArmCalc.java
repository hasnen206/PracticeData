package com.imarticus.assignments.armstrong;

public class ArmCalc {
	int sum = 0;
	int lastnum = 0;
	int mul = 0;

	public boolean checkNumber(int num) {

		int tempnum = num;
		while (num != 0) {
			lastnum = num % 10;

			mul = lastnum * lastnum * lastnum;
			sum += mul;
			num = num / 10;
		}
		if (tempnum == sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		for(int i=100; i<=999;i++){
			if(new ArmCalc().checkNumber(i)){
				System.out.println(i);
			}
		}
	}
}
