import java.util.*;
public class TheDiff {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = Integer.parseInt(scanner.nextLine());
		for(long i = 0; i < t; i++) {
			long n = Integer.parseInt(scanner.nextLine());
			
			long sum = (n * (n+1))/2;
			long sum_sq = (long)Math.pow(sum, 2);
	
			long sq_sum = (n * (n + 1) * (2 * n + 1))/6;
			long diff = sum_sq - sq_sum;
			System.out.println(diff);
		}
	}
}
