package datastuctures;
import java.util.ArrayList;

class DyArr{
	int size;
	int capacity = 10;
	Object[] array;
	
	public DyArr() {
		this.array = new Object[capacity];
	}
	public DyArr(int capacity) {
		this.array = new Object[capacity];
	}
	public void add(Object data) {
		if(size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;
	}
	public void insert(int index, Object data) {
		if(size >= capacity) {
			grow();
		}
		for(int i = size;i > index;i--) {
			array[i] = array[i-1];
		}
		array[index] = data;
		size++;
	}
	public void delete(Object data) {
		for(int i = 0;i < size;i++) {
			if(array[i] == data) {
				for(int j = 0;j < (size - i - 1);i++) {
					array[i+j] = array[i + j + 1];
				}
				array[size-1] = null;
				size--;
				if(size <= (int) (capacity/3)) {
					shrink();
				}
			}
		}
	}
	public int search(Object data) {
		for(int i = 0;i < size;i++) {
			if(array[i] == data) {
				return 1;
			}
		}
		return -1;
	}
	private void grow() {
		int newCap = (int)(capacity * 2);
		Object[] newArr = new Object[newCap];
		
		for(int i = 0;i < size;i++) {
			newArr[i] = array[i];
		}
		capacity = newCap;
		array = newArr;
	}
	private void shrink() {
		int newCap = (int)(capacity / 2);
		Object[] newArr = new Object[newCap];
		
		for(int i = 0;i < size;i++) {
			newArr[i] = array[i];
		}
		capacity = newCap;
		array = newArr;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public String toString() {
		String string = "";
		for(int i = 0;i < size;i++) {
			string += array[i] + ", ";
		}
		if(string != "") {
			string = "[" + string.substring(0, string.length() - 2) + "]";
		}else {
			string = "[]";
		}
		return string;
	}
}

public class dynamicArr {
	public static void main(String[] args) {
		DyArr dyarr = new DyArr();
		ArrayList<String> arr = new ArrayList<String>();
		
		dyarr.add("B");
		dyarr.add("C");
		
		dyarr.insert(0, "A");
		dyarr.delete("A");
		System.out.println(dyarr.search("C"));
		
		System.out.println(dyarr);
		System.out.println(dyarr.size);
		System.out.println(dyarr.capacity);
		System.out.println(dyarr.isEmpty());
	}
}
