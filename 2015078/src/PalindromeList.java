import java.util.*;
import java.io.*;
public class PalindromeList {
	public class RemoveDuplicates {

	}
	Node head;
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void isPalindrome(Node head) {
		Node temp = head;
		if(head == null) {
			System.out.println("List does not exist");
		}
		else if(head.next == null) {
			System.out.println("Palindrome");
		}
		else {
			java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
			while(temp != null) {
				stack.push(temp.data);
				temp = temp.next;
			}
			temp = head;
			while(temp!= null) {
				if(temp.data != stack.pop()) {
					System.out.println("Not a Palindrome");
					return;
				}
				else {
					temp = temp.next;
				}
			}
			System.out.println("Palindrome");
		}
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
		PalindromeList obj = new PalindromeList();
		
		obj.insert(1);
		obj.insert(0);
		obj.insert(1);
		obj.insert(1);
		obj.insert(1);
		obj.insert(1);
		
		
		obj.isPalindrome(obj.head);
	}
}
