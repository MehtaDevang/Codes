import java.util.*;
public class BestDivisor {
	
	public static int calc_sum(int n) {
		String str = Integer.toString(n);
		char[] arr = str.toCharArray();
		int sum = 0;
		for(char c : arr) {
			sum = sum + Integer.valueOf(c + "");
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long n = Long.parseLong(scanner.nextLine().trim());
		long temp = n;
		int max_sum = 0;
		int num = 0;
		for(int i = 1; i <= temp; i++) {
			if(temp % i == 0) {
				int sum = calc_sum(i);
				if(sum > max_sum) {
					max_sum = sum;
					num = i;
				}
				else if(sum == max_sum) {
					if(i < num) {
						num = i;
					}
				}
			}
		}
		System.out.println(num);
		
	}
}
