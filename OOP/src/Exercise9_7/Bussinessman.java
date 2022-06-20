package Exercise9_7;

public class Bussinessman implements Richman, Student{
	
	public Bussinessman() {
		System.out.println("default constructor");
	}
	private String name;
	private String address;
	
	
	public Bussinessman(String name, String address) {
	
		this.name = name;
		this.address = address;
	}

	

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}




	public void donation() {
		System.out.println("Good Person");
		}
	
	public void party() {
		System.out.println("Enjoyment");
	}
	
	public void ReadingBooks() {
		System.out.println("Entelligent");
	}
	
	public void EatingPizza() {
		System.out.println("Hungry");
	}

}
