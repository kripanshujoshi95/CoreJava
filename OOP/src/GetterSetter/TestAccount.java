
package GetterSetter;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setNumber("515426265658");
		a.setAccountType("saving");
		a.setBalance(5000);
		a.deposit(2000);
		a.withdrawl(1000);
		a.fundtransfer(1500);
		a.paybill(200);
		
		
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());   
		
		
		
	}

}
