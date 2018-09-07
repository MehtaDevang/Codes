import java.util.*;
public class BirthdayChocolates {
	static int ways = 0;
	static int d;
	static int m;
	
	public static int count(int[] arr, int index, int len, int sum) {
		int total = countWays(arr, index, len, sum);
		return total;
	}
	
	public static int countWays(int[] arr, int index, int len, int sum) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			int s = 0;
			for(int j = i; j < i+m && j < arr.length; j++) {
				s = s + arr[j];
			}
//			System.out.println(s);
			if(s == d) {
				total++;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[n];

		String[] str = scanner.nextLine().trim().split(" ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		String[] temp = scanner.nextLine().trim().split(" ");
		d = Integer.parseInt(temp[0]);
		m = Integer.parseInt(temp[1]);
		
		int total = count(arr, 1, 1, arr[0]);
		System.out.println(total);
	}
}
