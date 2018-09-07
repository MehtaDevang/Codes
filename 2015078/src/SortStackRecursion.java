import java.util.*;
public class SortStackRecursion {
	
	public void sortElements(java.util.Stack<Integer> stack, int data) {
		if(stack.isEmpty() || data > stack.peek()) {
			stack.push(data);
		}
		else {
			int temp = stack.pop();
			sortElements(stack, data);
			stack.push(temp);
		}
	}
	
	public void sort(java.util.Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			int temp = stack.pop();
			sort(stack);
			sortElements(stack, temp);
		}
	}
	public static void main(String[] args) {
		
		SortStackRecursion obj = new SortStackRecursion();
		
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		stack.push(5);
		stack.push(3);
		stack.push(8);
		stack.push(6);
		stack.push(2);
		stack.push(0);
		System.out.println(stack);
	
		obj.sort(stack);
		System.out.println(stack);
		
	}
}
