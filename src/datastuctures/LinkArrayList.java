package datastuctures;
import java.util.*;
import java.util.TimerTask;

public class LinkArrayList {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Integer> link = new LinkedList<>();
		ArrayList<Integer> arr = new ArrayList<>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		Thread.sleep(5000);
		System.out.println("Wow");
		
		for(int i = 0;i < 1000000;i++) {
			link.add(i);
			arr.add(i);
		}
		startTime = System.nanoTime();
		//link.get(0);
//		link.get(500000);
		link.get(999999);
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList:\t" + elapsedTime + "ns");
		
		startTime = System.nanoTime();
		//arr.get(0);
		//arr.get(500000);
		arr.get(999999);
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("ArrayList:\t" + elapsedTime + "ns");
	}

}
