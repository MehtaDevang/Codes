import java.util.*;
public class Speed {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			
			String[] str = scanner.nextLine().trim().split(" ");
			int count = 1;
			long[] arr = new long[n];
			for(int j = 0; j < n; j++) {
				arr[j] = Long.parseLong(str[j]);
			}
			
			for(int j = 1; j < n; j++) {
				if(arr[j] > arr[j-1]) {
					arr[j] = arr[j-1];
				}
				else {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
