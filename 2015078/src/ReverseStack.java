import java.util.Stack;
import java.io.*;
public class ReverseStack {
	
	public void insertAtBottom(Stack<Integer> stack, int x) {
		if(stack.isEmpty()) {
			stack.push(x);
		}
		else {
			int a = stack.peek();
			stack.pop();
			insertAtBottom(stack, x);
			stack.push(a);
		}
	}
	
//	public void print(Stack<Integer> stack) {
//		if(stack.isEmpty()) {
//			return;
//		}
//		else {
//			System.out.println(stack.peek());
//			
//		}
//	}
	public void reverse(Stack<Integer> stack) {
		int top = stack.pop();
		insertAtBottom(stack, top);
	}
	public static void main(String[] args) {
		ReverseStack obj = new ReverseStack();
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		obj.reverse(stack);
		System.out.println(stack);
	}
}
