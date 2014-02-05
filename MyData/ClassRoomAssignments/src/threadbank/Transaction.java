package threadbank;

public class Transaction extends Thread {
bankAccount account=null;

public Transaction(bankAccount account)
{
	this.account=account;
}

@Override
	public void run() {
		account.deposit(5000);
	}
}
