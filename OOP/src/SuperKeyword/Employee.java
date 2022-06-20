package SuperKeyword;

public class Employee extends Person {
	private String designation;

	public Employee(String name, String address, String designation) {
		
		super(name, address);
		this.designation = designation;
		System.out.println("parameter 1");

	}
	public static void main(String[] args) {
		
		
	Employee e = new Employee(null, null, null);
		
	}

	}

	

