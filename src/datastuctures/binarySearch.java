package datastuctures;

import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		
		//Binary Search////////////
		
		int array[] = new int[1000000];
		int target = 6584;
		
		for(int i = 0;i < array.length;i++) {
			array[i] = i;
		}
		
//		int index = Arrays.binarySearch(array, target);
		
		int index = BinarySearch(array, target);
		
		
		if(index == -1) {
			System.out.println("Element not found.");
		}else {
			System.out.println("Element found at: " + index);
		}
	}

	private static int BinarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int middle = low + (high - low) / 2;
			
			int value = array[middle];
			
			System.out.println("middle: " + value);
			
			if(value < target) {
				low = middle + 1;
			}else if(value > target){
				high = middle - 1;
			}else {
				return middle;
			}
		}
		
		return -1;
	}
}
