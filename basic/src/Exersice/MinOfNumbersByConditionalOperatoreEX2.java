package Exersice;

public class MinOfNumbersByConditionalOperatoreEX2 {
	public static void main(String[] args) {
		
		//find smaller value//
		int a=8, b=3;
		String s=(a<b)? "a is big": "b is small";
		System.out.println(s);
		
		//find greater value//
		int c=25698, d=25814;
		String f=(c<d)? "c is small":"d is bigger";
		System.out.println(f);
		
		//find greater value//
		int m=50, n=100, o=150;
	int l =	(m>n) ? (m>o ? m:o) : (n>o ? n:o); //(50>100) ? (50>150 ? 50:150) : (50>150 ? 50:150)
	System.out.println(l);
		
	}

}
