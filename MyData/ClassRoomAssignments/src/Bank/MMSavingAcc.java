package Bank;

public class MMSavingAcc extends SavingAcc {
	public MMSavingAcc(int AccNo,String accNm,float accBal,boolean isSalaried)
	{
		super(AccNo, accNm, accBal, isSalaried);
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
