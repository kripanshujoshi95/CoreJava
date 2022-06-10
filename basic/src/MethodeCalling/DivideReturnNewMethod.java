package MethodeCalling;

public class DivideReturnNewMethod {
	public static void main(String[] args) {
		int m = div ();
		System.out.println(m);
		
		int a = l();
		System.out.println(a);
		
		float l = rays();
		System.out.println(l);
		
	}
	
	public static int div () {
		int a = 50;
		int b = 5;
		int c = a/b;
		return c ;
	}
	
	public static int l() {
		int u = 25;
		int v = 5;
		int x = u/v;
		return x;
	}
	
	public static float rays() {
		float aa = 6.5f;
		float ab = 3.2f;
		float ac = aa/ab;
		return ac;
		}

}
