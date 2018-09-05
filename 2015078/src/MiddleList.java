import java.io.*;
import java.util.*;

public class MiddleList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void insert(int data) {
		Node temp = head;
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public int printMiddle() {
		int data = 0;
		Node temp = head;
		Node temp2 = head;
		if (head != null)
        {
            while (temp2 != null && temp2.next != null)
            {
                temp2 = temp2.next.next;
                temp = temp.next;
            }
            return temp.data;
        }
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MiddleList obj = new MiddleList();
		int choice;
		int data;
		while(true) {
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("data :");
				data = scanner.nextInt();
				obj.insert(data);
				break;
			case 2:
				System.out.println(obj.printMiddle());
			}
		}
	}
}
