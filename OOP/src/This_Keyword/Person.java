package This_Keyword;

// an overloaded constructor can be called from another constructor Using {This.} keyword

// implict call

public class Person {
	private String name;
	private String address;
	
	public void Person() {
		System.out.println("default constructor");
		}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return "name" +name;
				
		
	}
	
	public static void main(String[] args) {
		Person p = new Person("vijay", "indore");
		System.out.println(p);
		
	}
		
	}

