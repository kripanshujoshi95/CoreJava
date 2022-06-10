package oops;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile A = new Automobile();
		
		A.setColor("orange");
		A.setMake("BMW");
		A.setSpeed(120);
		A.Break(50);
		A.ChangeGear(2);
		A.acceleration(20);
		
		
		System.out.println(A.getColor());
		System.out.println(A.getMake());
		System.out.println(A.getspeed());
		
	}

}
