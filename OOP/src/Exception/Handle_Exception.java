package Exception;

public class Handle_Exception { 
	
	// Arithmetic Exception
	
	public static void main(String[] args) {
		
		int k=10;
		int i=0;
		
		
		int a = k/i;
		System.out.println(a);
		
		try {
			int division= i/k;
			System.out.println("div is "+ division);   //Arithmetic exception
			
		}
		
		catch(ArithmeticException e){
			System.out.println("divide nhi hoga");
			
		
		}

	}
}