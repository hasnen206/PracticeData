package threadbank;

public class TestTransaction {

	
	public static void main(String[] args) {
		bankAccount account=new bankAccount(4000,"hasnen");
		Transaction trans= new Transaction(account);
		Transaction trans1= new Transaction(account);
		Transaction trans2= new Transaction(account);
		trans.start();
		trans1.start();
		trans2.start();
	}

}
