package Exercise9_7;

public class StaticPolymorphism {
	
	public void  add(int a , int b) {
		System.out.println("add method with 2 integer = "+(a+b));
	}
	
	public void  add(int a , int b , int c) {
		System.out.println("add method with 3 integer= "+(a+b-c));
	}
	
	public void  add(int a , int b , String s) {
		System.out.println("add method with 2 integer and 1 String = "+(a+b+s));
	}
	
	public void  add(int a , float f) {
		System.out.println("add method with 1 integer and 1 float value = "+(a+f));
	}
	

}
