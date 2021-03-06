import java.util.*;
public class MonkAndRotation {
	
	public static long[] rotate(long[] arr, long k) {
		int len = arr.length;
		if(k == len) {
			return arr;
		}
		long[] a = new long[len];
			k = (int)k % len;
			for(int i = 0; i < k; i++) {
				a[i] = arr[(int)(len-k+i)];
			}
			int index = 0;
			for(int i = (int)k; i < len; i++) {
				a[i] = arr[index];
				index++;
			}
		return a;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = 0; i < t; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			long k = Long.parseLong(str[1]);
			long[] arr = new long[n];
 			String[] temp = scanner.nextLine().trim().split(" ");
			for(int j = 0; j < n; j++) {
				arr[j] = Long.parseLong(temp[j]);
			}
			
			long[] res = rotate(arr, k);
			
			for(int j = 0; j < n; j++) {
				System.out.print(res[j] + " ");
			}
			System.out.println("\n");
		}
	}
}
