package AbstractClass;

public class AnimalTest {
	public static void main(String[] args) {
		
		AnimalDog a = new AnimalDog();
		a.speed();
		a.bird();
		
		System.out.println("------childclass-----");
		a.breed();
		a.sound();
		
	
	}

}
