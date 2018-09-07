import java.util.*;
import java.util.Stack;
public class QueueUsingStacks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = Integer.parseInt(scanner.nextLine());
		Stack<Long> stack1 = new Stack<Long>();
		Stack<Long> stack2 = new Stack<Long>();
		for(int i = 0; i < q; i++) {
			String[] temp = scanner.nextLine().trim().split(" ");
			int operation = Integer.parseInt(temp[0]);
			if(operation == 1) {
				long x = Long.parseLong(temp[1]);
				stack1.push(x);
			}
			else if(operation == 2) {
				if(stack2.isEmpty()) {
					while(!stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
				}
				stack2.pop();
			}
			else {
				if(stack2.isEmpty()) {
					while(!stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
				}
				System.out.println(stack2.peek());
			}
		}
	}
	
}
