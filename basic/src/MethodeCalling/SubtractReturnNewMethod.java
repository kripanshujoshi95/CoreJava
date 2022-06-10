package MethodeCalling;

public class SubtractReturnNewMethod {
	public static void main(String[] args) {
		 
		int i = sub ();
		System.out.println(i);
	
		int m = z();
		System.out.println(m);
		
		int j = y();
		System.out.println(j);
	}
	
	
	public static int sub () {
		int a = 500;
		int b = 200;
		int c = a-b;
		return c;
	   }
	
	public static int z() {
		int q=100;
		int w=50;
		int t=q-w;
		return t;
	}
	
	public static int y() {
		int nh = 25;
		int cf = 10;
		int wc = nh-cf;
		return wc;
	}
	
	
}


