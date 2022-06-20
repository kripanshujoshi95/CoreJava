

package CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class ListInterfaceWithStack {
	public static void main(String[] args) {
		
		Stack s = new Stack();                 // Stack = FILO
		
		s.push(0);           
		s.push(1);          //push()= add an element 
		s.push(25);         //peek()= print last element,but does not remove element from stack
		s.push(5);          //pop()=  print last element and also remove element from stack
		s.push(14);
		s.push("sohhan");
		s.push(78);
		s.push("panshu");
	
		System.out.println(s);
		
		
		System.out.println("-------peek----");
	System.out.println(	s.peek());
	System.out.println(s.peek());
	System.out.println(s);
	
	
	System.out.println("-----------pop-----");
	
	    System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		
		
/*	System.out.println("----------for each loop----------");
		for (Object qw : s) {
			System.out.println(qw);
			}*/
		
		
		System.out.println("----------Iterator--------");
		
		Iterator it = s.iterator();
		
		while (it.hasNext()) {
			Object i =  it.next();
			System.out.println(i);
		}
		
		
				
		
		
	}

}
