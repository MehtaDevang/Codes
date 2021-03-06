import java.util.*;
import java.io.*;
public class RemoveDuplicates {
	Node head;
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void swapNodes(int x, int y) {
		Node prevX = null;
		Node currX = head;
		Node prevY = null;
		Node currY = head;
		
		while(currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}
		
		while(currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
		
		if(currX == null || currY == null) {
			return;
		}
		
		else {
			if(prevX != null) {
				prevX.next = currY;
			}
			else {
				head = currY;
			}
			
			if(prevY != null) {
				prevY.next = currX;
			}
			else {
				head = currX;
			}
			
			Node temp = currX.next;
			currX.next = currY.next;
			currY.next = temp;
		}
	}
	public void removeDup() {
		Node temp = head;
		Node temp2 = head;
		HashSet<Integer> s = new HashSet<Integer>();
		while(temp != null) {
			if(!s.contains(temp.data)) {
				s.add(temp.data);
			}
			else {
				temp2.next = temp.next;
			}
			temp2 = temp;
			temp = temp.next;
		}
	}
	
	public Node reverse(Node node) {
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	public void lastToFirst() {
		Node temp = head;
		Node temp2 = null;
		while(temp.next != null) {
			temp2 = temp;
			temp = temp.next;
		}
		temp.next = head.next;
		temp2.next = head;
		head.next = null;
		head = temp;
	}
	public void printList(Node h) {
		Node temp = h;
		while(temp != null) {
			System.out.print(temp.data);
			
			temp = temp.next;
		}
		System.out.print("\n");
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		
		obj.insert(5);
		obj.insert(3);
		obj.insert(1);
		obj.insert(4);
		obj.insert(2);
		obj.insert(7);
		obj.printList(obj.head);
		obj.swapNodes(3, 2);
		obj.printList(obj.head);
		obj.lastToFirst();
		obj.printList(obj.head);
		obj.reverse(obj.head);
		obj.printList(obj.head);
		obj.removeDup();
		obj.printList(obj.head);
		
	}
}
