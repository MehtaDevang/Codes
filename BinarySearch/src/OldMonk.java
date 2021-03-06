import java.util.*;
public class OldMonk {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine().trim());
			
			String[] str1 = scanner.nextLine().trim().split(" ");
			String[] str2 = scanner.nextLine().trim().split(" ");
			long[] arr1 = new long[n];
			long[] arr2 = new long[n];
			
			for(int j = 0; j < n; j++) {
				arr1[j] = Long.parseLong(str1[j]);
				arr2[j] = Long.parseLong(str2[j]); 
			}
			int max = 0;
			for(int j = 0; j < n-1; j++) {
				int upto = n-1;
				for(int k = j+(n-j)/2; k < n;) {
					if(arr2[k] >= arr1[j]) {
						int val = k - j;
						if(val > max) {
							max = val;
						}
						if(upto - k == 1 || upto - k == 0) {
							break;
						}
						k = k + (upto - k) / 2;
					}
					else {
						upto = k;
						k = k - (k - j)/2;
						if(k <= j+1) {
							break;
						}
					}
				}
			}
			System.out.println(max);
		}
			
	}
}
