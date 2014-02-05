package Bank;

public class MMConcreteBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,
			boolean isSalaried) {
			SavingAcc account=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
			return account;
	}
	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,
			float creditLimit) {
		CurrentAcc account= new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		
		return account;
	}
}
