package MethodeCalling;

public class IfElseReturnNewMethod {
	public static void main(String[] args) {
	
		 int uv = money();
		 System.out.println(uv);
		
		 int zx = p();
		 System.out.println(zx);
		 
		 
		 int mn =kgn(); 
		 System.out.println(mn);
		 
		 IfElseReturnNewMethod op =new IfElseReturnNewMethod();
		 op.joshi();
		
		
	}
	
	
	public static int money() {
		int s = 120;
		
		if(s<100) {
		return 0;	
		}
		return 1;
		
	}
	public static int p() {
		int a = 200;
		if(a<100) {
			return 50;
		}else {
		 return 75;
		}
		}
	
	public static int kgn() {
		int marks = 80;
		
		if(marks<100) {
			System.out.println("good");
		}else {
			System.out.println("bad");
			}
		return marks;
		}
	
	
	// void lgayenge to instance create krna pdega
	
	
	public void joshi() {  
	System.out.println ("surname");
	}
	
}
