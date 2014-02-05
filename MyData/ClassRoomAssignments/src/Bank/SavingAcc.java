package Bank;

public  class SavingAcc extends BankAcc {
	
		private boolean isSalaried;
		private static final float MINBAL=1000;
	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried)
	{	super(accNo,accNm,accBal);
		this.isSalaried=isSalaried;
		
	}
	
	private boolean isSalaried() {
		return isSalaried;
	}

	private float getMINBAL() {
		return MINBAL;
	}

	public void withdraw(float amount)
	{
		if(getAccBal()-amount>MINBAL)
		{
			setaccBal(getAccBal()-amount);
		}
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
}
