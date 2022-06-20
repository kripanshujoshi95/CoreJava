package Exception;

public class Generic_Catch {
	
	/**A catch block of parent class can handle exceptions of its sub classes. it can be used as a 
	  generic catch to handle multiple exceptions in down hierarchy.**/
	
	public static void main(String[] args) {
		
		String name = "vijay";
		try {
			System.out.println("length of name is  "+ name.length());
			System.out.println("character at 7th position is "+name.charAt(6));
		}
		catch (Exception e) {
			System.out.println("error = "+e.getMessage());
			
		}
			
		}
		
		
		
		
		
	}


