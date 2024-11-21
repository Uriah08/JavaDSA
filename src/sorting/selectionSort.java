package sorting;

public class selectionSort {
	public static void main(String[] args) {
		//Selection Sort /////// - Quadratic time O(n^2)
		
		int array[] = {9,1,8,2,7,3,6,4,5};
		
		selctionSort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	public static void selctionSort(int array[]) {
		for(int i = 0;i < array.length-1;i++) {
			int min = i;
			for(int j = i + 1; j < array.length;j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
}
