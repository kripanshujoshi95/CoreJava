package SortingComparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		ArrayList<Marksheet> m = new ArrayList<Marksheet>();
		
		m.add(new Marksheet("kripanshu", "joshi", 101));
		m.add(new Marksheet("vaibhav", "gehlot", 102));
		m.add(new Marksheet("kripanshu", "mishra", 103));
		m.add(new Marksheet("kripanshu", "sharma", 104));
		m.add(new Marksheet("kripanshu", "patidar", 105));
		m.add(new Marksheet("kripanshu", "rathod", 106));
		
		
		
		Collections.sort(m, new OrderbyCondition());
		
		for (Marksheet t : m) {
			System.out.println(t);
		}
	}

}
