import java.util.*;
import java.util.Stack;
public class JesseCookies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		long n = Long.parseLong(str[0]);
		long k = Long.parseLong(str[1]);
		String[] arr = scanner.nextLine().trim().split(" ");
		
		Stack<Long> stack = new Stack<>();
		long min = Long.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			long x = Long.parseLong(arr[i]);
			if(stack.isEmpty()) {
				stack.push(x);
				min = x;
			}
			else {
				if(x > min) {
					stack.push(x);
				}
				else {
					long temp = (2 * x) - min;
					min = x;
					stack.push(temp);
				}
			}
		}
		
		while(stack.peek() < k) {
			long min_s = Long.MAX_VALUE;
			long t1 = stack.pop();
			long val1;
			long val2;
			if(t1 >= min) {
				val1 = min;
			}
			else {
				val1 = (2 * min) - t1;
			}
			long t2 = stack.pop();
			if(t2 >= min) {
				val2 = min;
			}
			else {
				val2 = (2 * min) - t2;
			}
			
			long new_val = val1 + val2;
			stack.push(new_val);
		}
	}
}

