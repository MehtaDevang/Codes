import java.util.*;
public class SubsetConstruction {
	
	public int calcSub(int[] arr, int sum, int i) {
		return rec(arr, sum, arr.length-1);
	}
	
	public int rec(int[] arr, int sum, int i) {
		if(sum == 0){
			return 1;
		}
		else if(sum < 0) {
			return 0;
		}
		else if(i < 0) {
			return 0;
		}
		else if(sum < arr[i]) {
			return rec(arr, sum, i-1);
		}
		else {
			return rec(arr, sum - arr[i], i-1) + rec(arr, sum, i-1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[n];
		String[] str = scanner.nextLine().trim().split(" ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int sum = scanner.nextInt();
		SubsetConstruction obj = new SubsetConstruction();
		int subset = obj.calcSub(arr,n, sum);
	}
}
