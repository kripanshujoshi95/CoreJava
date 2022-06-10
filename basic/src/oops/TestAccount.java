package oops;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		a.setNumber("2025615565");
		a.setAccountType("saving");
		a.setBalance(5000);
		a.deposit(1000);
		a.withdrawl(500);
		a.fundtransfer(500);
		a.payBill(500);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
	}

}
