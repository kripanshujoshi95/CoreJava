package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueInterfaceWithPriorityQueue {
	public static void main(String[] args) {
		
		Queue q1 = new PriorityQueue();
		
		
		q1.add(50);
		q1.add(20);
		q1.add(30);
		q1.add(48);
		q1.offer(500);
		q1.offer(52);
		q1.offer(100);
		
		
		//q1.add(); Add and offer is same
				//System.out.println( q1.peek()); // give output in manner , follows priority , shows value
				// q1.element(); retrives , but does not remove
				 //q1.peek(); same as element
				 //q1.remove(); retrives and remove the head of the queue
				 // q1.poll(); same as remove
				 
		System.out.println(q1);
		
	}

}
