import java.util.*;
import java.util.Stack;
public class Waiter {
	static int last_prime = 0;
	static int last_count = 0;
	public static int calc_ith(int i) {
		int prime = 0;
		
		if(last_prime == 0) {
			last_prime = 2;
			last_count++;
			return 2;
		}
		else {
			for(int j = last_prime + 1; ;j++) {
				boolean is_prime = check(j);
				if(is_prime == true) {
					last_prime = j;
					last_count++;
					if(last_count == i) {
						return j;
					}
				}
			}
		}
	}
	
	public static boolean check(int n) {
		boolean is_prime = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				is_prime = false;
				break;
			}
		}
		return is_prime;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		Stack<Integer>[] stack = new Stack[q+1];
		Stack<Integer>[] b = new Stack[q+1];
		String[] temp = scanner.nextLine().trim().split(" ");
		stack[0] = new Stack<>();
		for(int j = 0; j < n; j++) {
			stack[0].push(Integer.parseInt(temp[j]));
		}
		for(int i = 1; i <= q; i++) {
			stack[i] = new Stack<>();
			b[i] = new Stack<>();
		}
//		
		for(int i = 1; i <= q; i++) {
			int prime = calc_ith(i);
			while(!stack[i-1].isEmpty()) {
				int x = stack[i-1].pop();
				if(x % prime == 0) {
					b[i].push(x);
				}
				
				else {
					stack[i].push(x);
				}
			}

		}
		for(int i = 1; i <= q; i++) {
			while(!b[i].isEmpty()) {
				System.out.println(b[i].pop());
			}
		}
		while(!stack[q].isEmpty()) {
			System.out.println(stack[q].pop());
		}
	}
}
