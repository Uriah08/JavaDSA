package deictionaryyy;

import java.util.*;

public class sampleChall {
	public static void main(String[] args) {
		String words = "Ako po ay pogi po ".toLowerCase();
		
		String[] phrase = words.split("\\s+");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String word : phrase) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
