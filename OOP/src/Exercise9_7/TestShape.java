package Exercise9_7;

public class TestShape {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setRadius(5);
		System.out.println( "circle radius= "+c.getRadius());
		System.out.println("circle area= "+c.area());
		
		System.out.println("---------rec------");
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(10);
		System.out.println("rectangle length= "+r.getLength());
		System.out.println("rectangle width= "+r.getWidth());
		System.out.println("rectangle area= "+r.area());
		
		System.out.println("-------tri---------");
		Triangle t = new Triangle();
		t.setBase(20);
		t.setHeight(20);
		System.out.println("triangle base= "+t.getBase());
		System.out.println("triangle height= "+t.getHeight());
		System.out.println("triangle area= "+t.area());
		
		Shape[] s = new Shape[3];
		
		s[0] = c;
		s[1] = r;
		s[2] = t;
		
		double totalarea =0;
		 for (int i = 0; i < s.length; i++) {
			 totalarea += s[i].area();
		 }
			 System.out.println("-----------total area------");
		 System.out.println("total area of circle, rec , triangle = "+totalarea);
		
		 }
	}

	
	


