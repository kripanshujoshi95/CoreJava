package MethodeCalling;

public class MultiplyReturnNewMethod {
	public static void main(String[] args) {
		
		int q = mul ();
		System.out.println(q);
		
		int p = m();
		System.out.println(p);
		
	}
	
	public static int mul () {
		int a = 20;
		int b = 20;
		int c = a*b;
		return c;
	}
	
	public static int m() {
		int q =10;
		int w =10;
		int t =q*w;
		return t;
		}

}
