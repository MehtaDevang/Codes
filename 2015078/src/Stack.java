import java.util.*;
import java.io.*;

public class Stack {
	
	public void print(java.util.Stack<Integer> stack) {
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int[] array = new int[5];
		System.out.print(array);
		Stack obj = new Stack();
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
//		System.out.println("Wanna pop?\n");
//		String choice = scanner.nextLine();
//		if(choice == "yes")
		stack.pop();
		obj.print(stack);
	}
}
