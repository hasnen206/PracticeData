package Bank;

public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc(int accNo,String accNm,float accBal,float creditLimit)
	{
		super(accNo, accNm, accBal, creditLimit);
	}
	
	public void withdraw(float amount)
	{
		super.withdraw(amount);
	}
	public String toString()
	{
		return super.toString();
	}

}
