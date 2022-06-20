package SortingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee1 {
	public static void main(String[] args) {
		
		List<Employee1> l = new ArrayList<>();
		
		l.add(new Employee1(107, "kripanshu", "90000"));
		l.add(new Employee1(102, "panshu", "80000"));
		l.add(new Employee1(103, "joshi", "70000"));
	
	
         Collections.sort(l);
         l.forEach(System.out::println);

}
}