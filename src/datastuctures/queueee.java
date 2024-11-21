package datastuctures;

import java.util.LinkedList;
import java.util.Queue;

public class queueee {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		//Queue - FIFO data structure. First in first out
		
		queue.offer("Karen");//EnQueue
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.size());
		System.out.println(queue.contains("Karen"));
		
		System.out.println(queue.peek());
		
		queue.poll(); //DeQueue
		System.out.println(queue.element());
		
		System.out.println(queue);
	}
}
