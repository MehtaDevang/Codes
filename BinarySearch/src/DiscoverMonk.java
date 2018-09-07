import java.util.*;
public class DiscoverMonk {
	
	public static String getIndex(long[] arr, long x) {
		long index = 0;
		int length = arr.length;
		int i = length / 2;
		int low = 0;
		int high = length - 1;
		while(true) {
			if(i <= high && i >= low) {
				if(x > arr[i]) {
					low = i+1;
					i = (i+1 + high) / 2;
					if(i == high) {
						break;
					}
				}
				else if(x < arr[i]) {
					high = i-1;
					i = (i - low) / 2;
					if(i == low) {
						break;
					}
				}
				else {
					return "YES";
				}
			}
			else
				break;
		}
		return "NO";
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		long n = Long.parseLong(str[0]);
		long q = Long.parseLong(str[1]);
		
		String[] temp = scanner.nextLine().trim().split(" ");
		long[] arr = new long[(int)n];
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(temp[i]);
		}
		Arrays.sort(arr);
		for(int i = 0; i < q; i++) {
			long x = Long.parseLong(scanner.nextLine().trim());
			String index = getIndex(arr, x);
			System.out.println(index);
		}
	}
}
