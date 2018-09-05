import java.util.*;
public class AbsolutePermutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			
			int[] arr = new int[n];
			
			for(int j = 0; j < n; j++) {
				int pos = j+1;
				int val = pos - k;
				if(val > 0) {
					arr[val - 1] = pos;
				}
				else if(val == 0) {
					arr[n-1] = pos;
				}
				else {
					arr[n + val - 1] = pos;
				}
			}
			boolean flag = false;
			for(int j = 0; j < n; j++) {
				if(arr[j] - (j+1) != k) {
					flag = true;
					break;
				}
			}
			if(flag == true) {
				System.out.print("-1");
			}
			else {
				for(int j = 0; j < n; j++) {
					System.out.print(arr[j] + " ");
				}
			}
			
		}
	}
}
