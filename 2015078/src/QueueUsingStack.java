import java.util.*;
import java.io.*;
public class QueueUsingStack {
	
	java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();
	java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();
	
	public void pushNode(int data) {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(data);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	
	public void print() {
		while(!stack1.isEmpty()) {
			System.out.print(stack1.pop() + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QueueUsingStack obj = new QueueUsingStack();
		
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		
		obj.pushNode(1);
		obj.pushNode(2);
		obj.pushNode(3);
		obj.pushNode(4);
		obj.pushNode(5);
		obj.pushNode(6);
		
		obj.print();
	}
}
