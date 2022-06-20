package AbstractClass;

public class Test {
	public static void main(String[] args) {
		
		
		System.out.println("--------car-------");
		Car c = new Car();
		c.start();
		c.tyres();
		c.model();
		c.color();
		
	System.out.println("--------scooter------");	
		Scooter s = new Scooter();
		s.start();
		s.tyres();
		s.seater();
		s.color();
		
		

}
}