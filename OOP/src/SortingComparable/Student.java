package SortingComparable;

public class Student implements Comparable<Student>{
	
	String name;
	int rollno;
	int Marks;
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", Marks=" + Marks + "]";
	}
	public Student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		Marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public int getMarks() {
		return Marks;
	}
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	

	
	}	
	

