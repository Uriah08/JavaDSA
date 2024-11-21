package datastuctures;
import java.util.LinkedList;
public class linkL {
	public static void main(String[] args) {
		
		//ArrayList
		
		LinkedList<String> link = new LinkedList<String>();
		
//		link.push("A");
//		link.push("B");
//		link.push("C");
//		link.push("D");
//		link.push("F");
//		link.pop();
		
		link.offer("A");
		link.offer("B");
		link.offer("C");
		link.offer("D");
		link.offer("F");
//		link.poll();
		link.add(4,"E");
		System.out.println(link.indexOf("D"));
		
		System.out.println(link.peekFirst());
		System.out.println(link.peekLast());
		link.addFirst("Z");
		link.addLast("G");
		
		String first = link.removeFirst();
		System.out.println(first);
		//as Well as the removeLast();
		System.out.println(link);
	}
}
