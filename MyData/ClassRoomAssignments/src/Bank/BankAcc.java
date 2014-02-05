package Bank;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo,String accNm,float accBal)
	{
		this.accNo=accNo;
		this.accBal=accBal;
		this.accNm=accNm;
	}
	
	private int getAccNo() {
		return accNo;
	}

	protected float getAccBal() {
		return accBal;
	}
	

	protected void setaccBal(float accBal) {
		this.accBal = accBal;
	}

	private void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public void withdraw(float amount)
	{
		accBal-=amount;
	}
		
	
	public void deposit()
	{
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal="
				+ accBal + "]";
	}
	
		
	
	
}
