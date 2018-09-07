import java.util.*;
public class CutSticks {
	static int global_min = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] str = scanner.nextLine().trim().split(" ");
		boolean flag = true;
		int arr[] = new int[n];
		int v = 0;
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				v = arr[0];
			}
			arr[i] = Integer.parseInt(str[i]);
			if(arr[i] != v) {
				flag = false;
			}
		}
		if(flag == true) {
			System.out.println(n);
		}
		else {
			Arrays.sort(arr);
			global_min = arr[0];
			check(arr);
		}
		
	}
	
	public static void check(int[] arr) {
		if(arr.length == 1) {
			System.out.println(1);
			return;
		}
		if(arr.length == 2) { 
			boolean flag = true;
			
			int val = arr[0];
			int curr = arr[0];
			for(int k : arr) {
				if(k == val) {
					continue;
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag == false) 
				System.out.println("2\n1");
			else {
				System.out.println("2");
			}
			return;
		}
		int min = arr[0];
		int i = 0;
		
		while(arr[i] == min && i < arr.length) {
			i++;
		}
		
		if(i == arr.length) {
			return;
		}
		
		System.out.println(arr.length);
		int[] a = new int[arr.length-i];
		for(int j = 0; j < a.length; j++) {
			a[j] = arr[i] - min;
			i++;	
		}
		check(a);
	}
}
