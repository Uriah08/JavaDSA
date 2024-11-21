package datastuctures;
import java.util.*;

class Grap{
	ArrayList<LinkedList<Nod>> alist;
	
	Grap(){
		alist = new ArrayList<>();
	}
	
	public void addNode(Nod node) {
		LinkedList<Nod> currentlist = new LinkedList<>();
		currentlist.add(node);
		alist.add(currentlist);
	}
	public void addEdge(int src, int dst) {
		LinkedList<Nod> currentList = alist.get(src);
		Nod dstNode = alist.get(dst).get(0);
		currentList.add(dstNode);
	}
	public boolean checkEdge(int src, int dst) {
		LinkedList<Nod> currentList = alist.get(src);
		Nod dstNode = alist.get(dst).get(0);
		currentList.add(dstNode);
		for(Nod node : currentList) {
			if(node == dstNode) {
				return true;
			}
		}
		return false;
	}
	public void print(){
		for(LinkedList<Nod> currentList : alist) {
			for(Nod node : currentList) {
				System.out.print(node.data + " -> ");
			}
			System.out.println();
		}
	}
}
class Nod{
	char data;
	Nod(char data){
		this.data = data;
	}
}
public class adjacencyList {
	public static void main(String[] args) {
		//Adjacency List///////= an array/array list made of linkedList === O(v)
		Grap graph = new Grap();
		
		graph.addNode(new Nod('A'));
		graph.addNode(new Nod('B'));
		graph.addNode(new Nod('C'));
		graph.addNode(new Nod('D'));
		graph.addNode(new Nod('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		graph.addEdge(2, 3);
		
		graph.print();
	}
}
