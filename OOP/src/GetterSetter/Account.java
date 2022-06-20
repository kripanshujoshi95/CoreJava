package GetterSetter;

public class Account {
	private String number =null;
	private String accountType =null;
	private double balance =0;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit (double d) {
		balance = balance+d;
		
	}
	public void withdrawl(double w) {
		balance = balance-w;
	}
	public void fundtransfer(double f) {
		balance = balance-f;
	}
	public void paybill (double p) {
		balance = balance-p;
		
		
		
		
		
		
		
	}

}
