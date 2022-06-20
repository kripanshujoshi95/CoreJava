package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInerfaceWithLinkedInterface {
	public static void main(String[] args) {
		
		Queue q = new LinkedList() ;
		
		q.add(50);
		q.add(20);
		q.add(30);
		q.add(48);
		q.offer(500);
		q.offer(52);
		q.offer(100);
		
		 //q.add and q.offer is same
		
		//q.offer( ,); // inserts element if possible , return true if possible
				//q.remove(); // removes head element , top element
				//System.out.println(q.poll()); //same as remove
				//System.out.println(q.poll());
				//q.element();// same as peek
				System.out.println(q.peek()); // prints the head element but doesn't remove , also return null
				//System.out.println(q.element());
		
	System.out.println(q);
	
	}

}
