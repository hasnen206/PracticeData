package Bank;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;
	private float dummyCredilLimit;
	public CurrentAcc(int AccNo,String accNm,float accBal,float creditLimit)
	{	
		super(AccNo, accNm, accBal);
		this.creditLimit=creditLimit;
		this.dummyCredilLimit=creditLimit;
		
		
	}
	
	private float getCreditLimit() {
		return creditLimit;
	} 
	public void withdraw(float amount)
	{dummyCredilLimit=(creditLimit+getAccBal())-amount;
		if(creditLimit+getAccBal()>amount)
		{
			if(getAccBal()-amount<0)
			{
				setaccBal(0);
			}
			else
				setaccBal(getAccBal()-amount);
			
		}
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", dummyCredilLimit="
				+ dummyCredilLimit + ", toString()=" + super.toString() + "]";
	}

	

}
