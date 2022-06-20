package CollectionFramework;

import java.util.*;


public class CollectionMethod {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(13);
		c.add(45);
		c.add(455);
		c.add("rays");
		c.add("tech");
		
	/**Collection c1 = new ArrayList();
		
		c1.add(13);
		c1.add(45);
		c1.add(455);
		c1.add("rays");
		c1.add(13);
		c1.add(45);
		c1.add(455);
		c1.add(465464643);
		c.addAll(c);
	///	c.clear();
		//System.out.println(c.contains(45));
		//System.out.println(c.containsAll(c));
		//System.out.println(c.isEmpty());
		//c.remove(13);
      // c.removeAll(c);
		//c.retainAll(c);
		//System.out.println(c.size());
     
		System.err.println(c1.retainAll(c));
		System.out.println(c1);
		System.out.println(c);**/
		
		for (Object w: c) {           //for loop and iterate same work krta h values ko array se nikalne k liye
			System.out.println(w);
			
		}
		
		System.out.println("-----------iterator---------");
		
		Iterator it = c.iterator();
		
		while (it.hasNext()) {
			Object o =  it.next();
			System.out.println(o);
		}
		
		}
	}


