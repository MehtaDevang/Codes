import java.util.*;
import java.io.*;
public class SortStack {
	int num;

	java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();
	java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();
	
	public void stack_push(int data) {
		if(stack1.isEmpty()) {
			stack1.push(data);
		}
		else {
			num = stack1.peek();
			if(data > num) {
				stack2.push(stack1.pop());
				stack_push(data);
				stack1.push(stack2.pop());
			}
			else {
				stack1.push(data);
			}
			
		}
	}
	
	public void printStack() {
		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SortStack obj = new SortStack();
		obj.stack_push(5);
		obj.stack_push(8);
		obj.stack_push(3);
		obj.stack_push(2);
		obj.stack_push(9);
		obj.stack_push(10);
		obj.printStack();
		
		
	}
}
