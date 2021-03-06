import java.util.*;
public class SwapNodes {
//	
//	public static int func(int n) {
//		return func_calc(n);
//	}
//	
//	public static int func_calc(int n) {
//		if(n <= 3) {
//			return n;
//		}
//		else {
//			int num = calc(n);
//			if(num == 0) {
//				return 1 + func_calc(n - 1);
//			}
//			return Math.min(1+ func_calc(n-1), 1 + func_calc(num));
//		}
//	}
	
	public static int calc(int n) {
		int num = (int)Math.sqrt(n);
		int val = 0;
		while(num > 1) {
			if(n % num == 0) {
				val = Math.max(num, n/num);
				break;
			}
			num--;
		}
		if(val == 0) {
			return num - 1;
		}
		return val;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int q = Integer.parseInt(scanner.nextLine().trim());
		int[] arr = new int[1000001];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		int max_index = 3;
		for(int i = 0; i < q; i++) {
			int n = Integer.parseInt(scanner.nextLine().trim());
			if(n <= max_index) {
				System.out.println(arr[n]);
			}
			else {
				for(int j = max_index+1; j <= n; j++) {
					int num = calc(j);
					arr[j] = Math.min(1 + arr[j-1], arr[num] + 1);
				}
				System.out.println(arr[n]);
			}
		}
	}
}
