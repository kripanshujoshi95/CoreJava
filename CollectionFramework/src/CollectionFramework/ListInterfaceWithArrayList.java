package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceWithArrayList { 
	public static void main(String[] args) {
		
		List l = new ArrayList();
		                              //Duplicate and Null values can be inserted into a list
		l.add(10);
		l.add(52);
		l.add(1015);
		l.add(56);
		l.add(18);
		l.add(62);
		l.add(145);
		l.add(52);
		
	    
	/**	l.add(2, 56);    //insert an object at given index
		System.out.println(l);**/
		
		//System.out.println(l.get(1));            // returns an object from given index
		
		
		//System.out.println(l.remove(5));        // remove an object from given index
		
		//l.set(arg0, arg1)                       //replace element at given index
		
		//System.out.println(l.subList(3, 6));    // print element from index - to index
		
	    //  System.out.println(l.indexOf(52));    //searches an element from start and returns index
	//	System.out.println(l.lastIndexOf(52));    //searches an element from end and returns index
		
		
		System.out.println(l);                    //print all the element in array in horizontally
		
		
		for  (Object f : l) {                       // iterator = print all elements  without array in vertically 
			System.out.println(f);
			}
		
		
		
	}
	

}
