package GetterSetter;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile A = new Automobile();
		A.setColor("pink");
		A.setMake("ferrari");
		A.setSpeed(200);
		A.Break(50);
		A.changeGear(30);
		A.acceleration(85);
		
		System.out.println(A.getColor());
		System.out.println(A.getMake());
		System.out.println(A.getSpeed());
	}

}
