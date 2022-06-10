

package UserInput;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("addition of two numbers");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = a+b;
		
		System.out.println("add of a+b is " + c);
		
		
		
		System.out.println("subtraction of two numbers");
		int q = i.nextInt();
		int w = i.nextInt();
		int e = q-w;
		
		System.out.println("subtraction is " +e);
		

		
		
		System.out.println("multliplication of two numbers");
		int z = i.nextInt();
		int x = i.nextInt();
		int v = z*x;
		
		System.out.println("multiplication is " +v);
		
		

		
		System.out.println("division of two numbers");
		int m = i.nextInt();
		int n = i.nextInt();
		int o = m/n;
		
		System.out.println("division is " +o);
		
		
		
		
		
	}

}
