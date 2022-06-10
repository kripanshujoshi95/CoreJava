package UserInput;

import java.util.Scanner;


public class AddSubMulDiv {
	public static void main(String[] args) {
		
		
		Scanner S = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("enter a and b number");
		 a=S.nextInt();
		 b=S.nextInt();
		 
		 
		 System.out.println("addition is "+(a+b));
		 System.out.println("subtraction is "+(a-b));
		 System.out.println("multiplication is "+(a*b));
		 System.out.println("division is "+(a/b));
					
		
		
		
		
	}

}
