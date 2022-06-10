package MethodeCalling;

public class ReturnTestmethodcalling1 {
	public static void main(String[] args) {
		int d = add ();
		System.out.println(d);
		
		int e = sub ();
		System.out.println(e);
		
		int l = multiply ();
		System.out.println(l);
		
		int z = string ();
		System.out.println(z);
	}
	
	public static int add(){
	int a = 50;
	int b = 50;
	int c = a+b;
	return c;

}
	public static int sub() {
	int f = 300;
	int g = 200;
	int h = f+g;
	return h;
	
	
}
	
	
	public static int multiply() {
		int i =15;
		int j =10;
		int k =i*j;
		return k;
	}
	
	public static int string () {
		int m = 500;
		int n = 50;
		int o = m/n;
		
		
		if (o<120) {
	return  0;
			
		}else {
			return 1;
		}
		
	}
	
	
}