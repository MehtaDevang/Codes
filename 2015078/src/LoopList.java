import java.util.*;
import java.io.*;
public class LoopList {
	Node head;
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
        while (h != null)
        {
             // If we have already has this node
             // in hashmap it means their is a cycle
             // (Because you we encountering the
             // node second time).
            if (s.contains(h))
                System.out.println("Loop detected");
   
            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);
   
            h = h.next;
        }
   
        System.out.println("Loop Not detected");
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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LoopList obj = new LoopList();
		
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);

		obj.head.next.next.next.next = obj.head;
		obj.detectLoop(obj.head);
		
		
	}
}
