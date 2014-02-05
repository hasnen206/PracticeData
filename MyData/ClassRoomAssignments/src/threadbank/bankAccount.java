package threadbank;

public class bankAccount {
private double accountBalance;
private String accountName;



public bankAccount(double accountBalance, String accountName) {
	
	this.accountBalance = accountBalance;
	this.accountName = accountName;
}
public double getAccountBalance() {
	
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	this.accountBalance = accountBalance;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}

public synchronized void deposit(double amount){
	double accountBal=getAccountBalance();
	System.out.println("Getting Balance"+ getAccountBalance());
	setAccountBalance(accountBal+amount);
	System.out.println("After Process "+ getAccountBalance());
}

}
