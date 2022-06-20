package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Marksheet1 {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		Marksheet m1 = new Marksheet("0815ce2059", "rays", 60, 70, 80);
		Marksheet m2 = new Marksheet("0585ce6489", "tech", 25, 35, 45);
		l.add(m1);
		l.add(m2);
		
		l.contains(m2);
		
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Marksheet m= null;
			m =(Marksheet)  it.next();
			
			
		
		
		System.out.print("Roll no.= "+m.getRollNo());
		System.out.print("name= "+m.getName());
		System.out.print("physics= "+m.getPhysics());
		System.out.print("chemistry= "+m.getChemistry());
		System.out.println("maths= "+m.getMaths());
		
		}
	}

}
