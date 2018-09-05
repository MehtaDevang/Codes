import java.util.*;
public class EqualStacks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		int n3 = Integer.parseInt(str[2]);
		
		Queue<Integer> q1 = new LinkedList();
		Queue<Integer> q2 = new LinkedList();
		Queue<Integer> q3 = new LinkedList();
		
		long sum1 = 0;
		long sum2 = 0;
		long sum3 = 0;
		
		String[] temp1 = scanner.nextLine().trim().split(" ");
		for(int i = 0; i < n1; i++) {
			sum1 = sum1 + Integer.parseInt(temp1[i]);
			q1.add(Integer.parseInt(temp1[i]));
		}
		
		String[] temp2 = scanner.nextLine().trim().split(" ");
		for(int i = 0; i < n2; i++) {
			sum2 = sum2 + Integer.parseInt(temp2[i]);
			q2.add(Integer.parseInt(temp2[i]));
		}
		
		String[] temp3 = scanner.nextLine().trim().split(" ");
		for(int i = 0; i < n3; i++) {
			sum3 = sum3 + Integer.parseInt(temp3[i]);
			q3.add(Integer.parseInt(temp3[i]));
		}
		
		long min = Math.min(sum1, Math.min(sum2, sum3));
		int res = 0;
		while(sum1 != sum2 || sum2 != sum3) {
			if(sum1 > min) {
				int x = q1.peek();
				q1.remove(x);
				sum1 = sum1 - x;
				if(sum1 < min) {
					min = sum1;
				}
			}
			if(sum2 > min) {
				int x = q2.peek();
				q2.remove(x);
				sum2 = sum2 - x;
				if(sum2 < min) {
					min = sum2;
				}
			}
			if(sum3 > min) {
				int x = q3.peek();
				q3.remove(x);
				sum3 = sum3 - x;
				if(sum3 < min) {
					min = sum3;
				}
			}
			if(sum1 == 0 || sum2 == 0 || sum3 == 0) {
				min = 0;
				break;
			}
			if(sum1 < 0 || sum2 < 0 || sum3 < 0) {
				min = -1;
				break;
			}
		}
		System.out.println(min);
	}
}
