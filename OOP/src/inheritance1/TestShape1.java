package inheritance1;

public class TestShape1 {
	
	public static void main(String[] args) {
		
		
		Rectangle1 r = new Rectangle1(99,90);
		
		System.out.println("----------Shape------------");
		r.setColor("orange"); 
		r.setBorderWidth(10);
		
	    System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());
		
		
		System.out.println("----------rectangle-----------");
		r.setLength(20);
		r.setWidth(20);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.area());
		
		System.out.println("-----------circle------------");
		Circle1 c = new Circle1();
		c.setRadius(10);
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
		System.out.println("------------Triangle----------");
		Triangle1 t = new Triangle1();
		t.setBase(5);
		System.out.println(t.getBase());
		System.out.println(t.area());
		
		Shape1 s1=new Rectangle1(22,34);
		System.out.println(s1.area());
		
	}

}
