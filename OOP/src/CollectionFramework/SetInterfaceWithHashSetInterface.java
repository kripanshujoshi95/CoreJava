package CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceWithHashSetInterface  {
	public static void main(String[] args) {
	
		Set s = new HashSet();     
		
		s.add(10);
		s.add(52);
		s.add(1015);
		s.add(56);        // print in random form
		s.add(18);
		s.add(62);
		s.add(145);
		
	
		for (Object o : s) {
			
		
		System.out.println(o);
		
		}
		
		
		
		
		
		
	}

}
