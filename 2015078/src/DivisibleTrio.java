import java.util.*;
public class DivisibleTrio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int[] arr = new int[n];
		String[] s = scanner.nextLine().trim().split(" ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int count = 0;
		for(int i = 0; i < n-2; i++) {
			int sum = 0;
			for(int j = i+1; j < n-1;j++) {
				for(int k = j+1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum % m == 0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
