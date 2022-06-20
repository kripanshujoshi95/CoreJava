package SortingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		
		ArrayList<Marksheet> m = new ArrayList<>();
		
		m.add(new Marksheet("A", "kripanshu", 90));
		m.add(new Marksheet("A4", "Sourabh", 75));
		m.add(new Marksheet("A2", "sachin", 82));
		m.add(new Marksheet("A1", "abhishek", 61));
		m.add(new Marksheet("A5", "rohit", 54));
		
		Collections.sort(m);
		for (Marksheet n : m) {
			System.out.println(n);
			
		}
		
		
		
		
		
	}

}
