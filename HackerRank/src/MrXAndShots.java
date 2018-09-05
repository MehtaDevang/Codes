import java.util.*;
public class MrXAndShots {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		long[] A = new long[n];
		long[] B = new long[n];	
		for(int i = 0; i < n; i++) {
			String[] s = scanner.nextLine().trim().split(" ");
			A[i] = Integer.parseInt(s[0]);
			B[i] = Integer.parseInt(s[1]);
		}
		
		
		int sum = 0;
		
		for(int i = 0; i < m; i++) {
			int count = 0;
			String[] s = scanner.nextLine().trim().split(" ");
			int c = Integer.parseInt(s[0]);
			int d = Integer.parseInt(s[1]);
			
			for(int j= 0; j < n; j++) {
				if(c > B[j] || d < A[j]) {
					continue;
				}
				if((c >= A[j] && c <= B[j]) || (d >= A[j] && d <= B[j]) || (c <= A[j] && d >= B[j])) {
					count++;
				}
			}
			sum = sum + count;
		}
		System.out.println(sum);
	}
}
