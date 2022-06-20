package SortingComparator;

public class Marksheet {
	
	String fname;
	String lname;
	int id;
	
	
	@Override
	public String toString() {
		return "Marksheet [fname=" + fname + ", lname=" + lname + ", id=" + id + "]";
	}


	public Marksheet(String fname, String lname, int id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public int getId() {
		return id;
	}
	
	

}
