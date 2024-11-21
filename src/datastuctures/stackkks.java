package datastuctures;

import java.util.Stack;

public class stackkks {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.isEmpty());
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("Final-Fantasy");
		stack.push("God of War");
		stack.push("Borderlands");
		
//		System.out.println(stack);
		
		String myFav = stack.pop();
		System.out.println(myFav);
		
		System.out.println(stack.search("Minecraft"));
		
		
	}
}
