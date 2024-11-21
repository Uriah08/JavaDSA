package Trees;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data){this.data = data;}
}
class BinarySearchTree{
	Node root;
	
	public void insert(Node node) {
		root = inserthelper(root,node);
	}
	private Node inserthelper(Node root, Node node) {
		
		int data = node.data;
		
		if(root == null) {
			root = node;
			return root;
		}else if(data < root.data) {
			root.left = inserthelper(root.left, node);
		}else {
			root.right = inserthelper(root.right, node);
		}
		return root;
	}
	public void display() {
		displayHelper(root);
	}
	private void displayHelper(Node root) {
		if(root != null) {
			//In-Order
			displayHelper(root.left);
			System.out.println(root.data);
			displayHelper(root.right);
			
			
			//Post-Order
//			displayHelper(root.left);
//			displayHelper(root.right);
//			System.out.println(root.data);
			
			
			//Pre-Order
//			System.out.println(root.data);
//			displayHelper(root.left);
//			displayHelper(root.right);
		}
		
	}
	public boolean search(int data) {
		return searchHelper(root, data);
	}
	private boolean searchHelper(Node root, int data) {
		if(root == null) {
			return false;
		}else if(root.data == data) {
			return true;
		}else if(root.data > data) {
			return searchHelper(root.left, data);
		}else {
			return searchHelper(root.right, data);
		}
	}
	public void remove(int data) {
		if(search(data)) {
			removeHelper(root, data);
		}else {
			System.out.println(data + " not found.");
		}
	}
	public Node removeHelper(Node root, int data) {
		if(root == null) {
			return root;
		}else if(data < root.data) {
			root.left = removeHelper(root.left, data);
		}else if(data > root.data) {
			root.right = removeHelper(root.right, data);
		}else {//Node Found
			if(root.left == null && root.right == null) {
				root = null;
			}else if(root.right != null) {//Find a successor to replace this node
				root.data = successor(root);
				root.right = removeHelper(root.right, root.data);
			}else {//find a predecesor to replace this node
				root.data = predecessor(root);
				root.left = removeHelper(root.left, root.data);
			}
		}
		return root;
	}
	private int successor(Node root) {//find the least value below the right child of this root node
		root = root.right;
		while(root.left != null) {
			root = root.left;
		}
		
		return root.data;
	}
	private int predecessor(Node node) {
		root = root.left;
		while(root.right != null) {
			root = root.right;
		}
		
		return root.data;
	}
}
public class tree {
	public static void main(String[] args) {
		//Binary Search Tree has a O(log n)
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(new Node(5));
		tree.insert(new Node(1));
		tree.insert(new Node(9));
		tree.insert(new Node(2));
		tree.insert(new Node(7));
		tree.insert(new Node(3));
		tree.insert(new Node(6));
		tree.insert(new Node(4));
		tree.insert(new Node(8));
		
		tree.remove(3);
		tree.display();
		System.out.println(tree.search(5));
	}
}
