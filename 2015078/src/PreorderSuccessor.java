import java.util.*;
import java.io.*;
public class PreorderSuccessor {
	int successor = 0;
	Node root = null;
	public class Node{
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void insert(Node temp, int data) {
		Node node = new Node(data);
		insertNode(temp, node, data);
	}
	
	public void insertNode(Node temp, Node node, int data ) {
		if(root == null) {
			root = node;
			return;
		}
		else if(temp == null) {
			temp = node;
			return;
		}
		else {
			if(data <= temp.data) {
				insertNode(temp.left, node, data);
			}
			else {
				insertNode(temp.right, node, data);
			}
		}
	}
	
	public int preorder(Node root, int[] array, int data) {
		if(root.data == data) {
			return successor;
		}
		else{
			successor = root.data;
//		System.out.println(root);
		
		preorder(root.left, array, data);
		preorder(root.right, array, data);
		
		return successor;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PreorderSuccessor obj = new PreorderSuccessor();
		
		obj.insert(obj.root, 20);
		obj.insert(obj.root, 10);
		obj.insert(obj.root, 26);
		obj.insert(obj.root, 4);
		obj.insert(obj.root, 18);
		obj.insert(obj.root, 24);
		obj.insert(obj.root, 27);
		obj.insert(obj.root, 14);
		obj.insert(obj.root, 19);
		obj.insert(obj.root, 13);
		obj.insert(obj.root, 15);
		
		int[] array = new int[11];
		
		System.out.println(obj.preorder(obj.root, array, 19));
	}
}
