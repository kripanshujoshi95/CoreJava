package AbstractClass;

public class AnimalDog extends Animal{
	
	public void breed() {
		System.out.println("Bulldog");    
	}
	public void sound() {
		System.out.println("bark");
	}
	
	public void speed () {              // <=abstract method ki body bnayi
		System.out.println("Fast");
	}
	

}
