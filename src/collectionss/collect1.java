package collectionss;
class GenericList<T>{
	private T[] items = (T[]) new Object[10];
	private int count;
	
	public void add(T item) {items[count++] = item;}
	public T get(int index) {return items[index];}
	public void display() {
		for(T item : items) {
			System.out.println(item);
		}
	}
}
public class collect1 {
	public static void main(String[] args) {
		var list = new GenericList<String>();
		
		list.add("Hotdog");
		list.add("Burger");
		
		
//		list.display();
	}
}
