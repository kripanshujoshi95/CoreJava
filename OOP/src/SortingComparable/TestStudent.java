package SortingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	
	public static void main(String[] args) {
		ArrayList s1 = new ArrayList() ;
		
		s1.add(new Student("kripanshu", 10, 90));
		s1.add(new Student("rahul", 15, 80));
		s1.add(new Student("panshu", 20, 98));
		s1.add(new Student("anuj", 25, 100));
		
		
		
		Collections.sort(s1);
		
	    s1.forEach(System.out::println);
		//for (Student s : s1) {
			//System.out.println(s);
			
		//}
		
	}

}
