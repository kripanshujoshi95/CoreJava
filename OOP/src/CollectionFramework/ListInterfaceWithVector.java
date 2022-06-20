package CollectionFramework;

import java.util.List;
import java.util.Vector;

public class ListInterfaceWithVector {
	public static void main(String[] args) {
		
		List l = new Vector();
		
		l.add(25);
		l.add(86);
		l.add(241);
		l.add(255);
		l.add(205);
		l.add(48);
		l.add(259);
		l.add(55);
		
	//	l.add(0, 20);
	//	System.out.println(l.get(3));
	//	System.out.println(l.remove(2));
	//	System.out.println(l.set(1, "kj"));
	//	System.out.println(l.subList(2, 6));
	//	System.out.println(l.indexOf(255));
	//	System.out.println(l.lastIndexOf(259));
		
		System.out.println(l);
		for (Object o : l) {
			System.out.println(o);
		}
		
		
	}

}
