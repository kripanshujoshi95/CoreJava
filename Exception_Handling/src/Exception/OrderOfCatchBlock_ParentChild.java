package Exception;

public class OrderOfCatchBlock_ParentChild {
	// catch block of a child class must first in order,if parent's class catch does not exist.
	
	public static void main(String[] args) {
		
		
		String name = "vijay";
		try {
			System.out.println("length of name is  "+ name.length());
			System.out.println("character at 7th position is "+name.charAt(6));
		}
		
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String choti h");
		}
		catch(RuntimeException e) {
			System.out.println("error "+e.getMessage());
			
		}
			
		
		
		
		
		
		
	}

}
