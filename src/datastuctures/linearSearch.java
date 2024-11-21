package datastuctures;

public class linearSearch {

	public static void main(String[] args) {
		//Linear Search///////////
		int[] array = {9,1,8,2,7,3,6,4,5};
		
		int index = linearSearch(array,10);
		
		System.out.println(index);
	}

	private static int linearSearch(int[] array, int value) {
		
		for(int i = 0;i < array.length;i++) {
			if(array[i] == value) {
				return i;
			}
		}
		
		return -1;
	}

}
