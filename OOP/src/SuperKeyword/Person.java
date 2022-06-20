package SuperKeyword;
//parent class constructor can be called from child class constructor using {super.} keyword

// Explicit call

public class Person {
	String name ;
	String address;
	
	
	 

	public Person(String name, String address) {
	
		this.name = name;
		this.address = address;
		System.out.println("parameter is 0");
	}
	 
	 

}
