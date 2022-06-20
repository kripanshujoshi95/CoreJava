package Constructor;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s = new Shape("blue", 10, "kripanshu");
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		System.out.println(s.getName());
		
	}

}
