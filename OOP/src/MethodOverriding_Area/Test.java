package MethodOverriding_Area;

public class Test {
	public static void main(String[] args) {
		System.out.println("-----------Circle--------");
		Shape s = new Circle();
		Circle c = (Circle) s;
		
		c.setRadius(5);
		
		System.out.println("circle area =  "+c.area());
		
		
		
		System.out.println("-----------rectangle-------------");
		Shape ss = new Rectangle();
		Rectangle R = (Rectangle) ss;
		 R.setLength(10);
		R.setWidth(5);
		 System.out.println("Rectangle area = "+R.area());
		
		 
		 System.out.println("-------------Triangle-----------------");
		 Shape sss = new Triangle();
		 Triangle t = (Triangle) sss;
		 
		 t.setBase(10);
		 t.setHeigth(5);
		  System.out.println("Triangle area =  "+t.area());
	}
	

}
