package Exercise9_7;

public class Person {
	
	private String firstName;
	private String lastName;
	
	
	
	public Person(String firstName, String lastNmae) {
		
		this.firstName = firstName;
		this.lastName = lastNmae;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastNmae() {
		return lastName;
	}
	
	public String toString() {
		return firstName+" "+ lastName;
		
		
		
	}

}
