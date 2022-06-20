
package Inheritance;

public class TestShape {
	public static void main(String[] args) {
	
	
	Circle c =new Circle(55);
	Rectangle r=new Rectangle();
	Triangle t=new Triangle(20, 30);
	System.out.println("circal"+c.area());
	System.out.println(t.area());
	Shape s= new Triangle(20,30);
	System.out.println(s.area());
	Shape [] s1=new Shape[3];
	
	
	
	}
}
