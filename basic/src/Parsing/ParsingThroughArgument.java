package Parsing;

public class ParsingThroughArgument {
	public static void main(String[] args) {
		                                   
		//String se integer value me convert k liye parse ka use krenge
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		
		int sum = a+b;
		int sub = b-a;
		int mul = c*b;
		int div = a/b;
		System.out.println("add is "+sum);
		System.out.println("subtract is "+sub);
		System.out.println("multiply is "+mul);
		System.out.println("divide is "+div);
		System.out.println(d-b);
		
		}

}
