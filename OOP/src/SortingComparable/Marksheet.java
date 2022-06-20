package SortingComparable;

public class Marksheet implements Comparable<Marksheet>{
	
	String rollno;
	String name;
	int marks;
	
	
	@Override
	public String toString() {
		return "Marksheet [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}


	public Marksheet(String rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


	public String getRollno() {
		return rollno;
	}


	public String getName() {
		return name;
	}


	public int getMarks() {
		return marks;
	}


	@Override
	public int compareTo(Marksheet o) {
		
		return this.rollno.compareTo(o.rollno);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
