package Bank;

import java.util.Scanner;

import javax.swing.plaf.metal.MetalMenuBarUI;

public class TestBank {

	public static void main(String[] args) {
		BankFactory obj=new MMConcreteBankFactory();
		System.out.println("Enter 1 For Saving Account and 2 for Current Account");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		BankAcc ba=null;
		if(i==1)
		{
			ba=obj.getNewSavingAcc(1,"hasnen",5000,true);
			ba.withdraw(1000);
			System.out.println(ba);
		}
		else
			{
			ba=obj.getNewCurrentAcc(1,"Hasnen",5000,10000);
			ba.withdraw(2000);
			System.out.println(ba);
			}
		}
	}


