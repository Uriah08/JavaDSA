package sorting;

public class mergeSorting {

	public static void main(String[] args) {
		//Merge Sorting//// O(n log n)
		
		int array[] = {9,1,8,2,7,3,6,4,5};
		
		mergeSort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void mergeSort(int[] array) {
		int length = array.length;
		
		if(length <= 1)return;
		
		int middle = length / 2;
		
		int[] left = new int[middle];
		
		int[] right = new int[length - middle];
		
		int i = 0;
		int j = 0;
		
		for(; i < length;i++) {
			if(i < middle) {
				left[i] = array[i];
			}else {
				right[j] = array[i];
				j++;
			}
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
	}
	private static void merge(int[] left, int[] right, int[] array) {
		int leSize = array.length / 2;
		int riSize = array.length - leSize;
		int i = 0, l = 0, r = 0;
		
		while(l < leSize && r < riSize) {
			if(left[l] < right[r]) {
				array[i] = left[l];
				i++;
				l++;
			}
			else {
				array[i] = right[r];
				i++;
				r++;
			}
		}
		while(l < leSize) {
			array[i] = left[l];
			i++;
			l++;
			
		}while(r < riSize) {
			array[i] = right[r];
			i++;
			r++;
		}
	}
}
