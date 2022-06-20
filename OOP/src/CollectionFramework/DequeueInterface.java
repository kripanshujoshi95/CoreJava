package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueInterface {
	public static void main(String[] args) {
		
		
		Deque d = new ArrayDeque();         //FIFO
		d.add(50);
		d.add(20);
		d.add(30);
		d.add(48);
		d.offer(500);
		d.offer(52);
		d.offer(100);
		
		
		System.out.println(d);
		
		System.out.println("-------poll---------");
		//System.out.println(d.poll());
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
		System.out.println(d);
		
		System.out.println("---------peek------");
		//System.out.println(d.peek());
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		System.out.println(d);
		
	}

}
