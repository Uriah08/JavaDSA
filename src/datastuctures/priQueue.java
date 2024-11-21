package datastuctures;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class priQueue {
	public static void main(String[] args) {
		
		Queue<Double> queue = new PriorityQueue<>(); //Collections.reversedOrder
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
