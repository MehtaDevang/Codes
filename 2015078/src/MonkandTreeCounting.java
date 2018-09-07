import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class MonkandTreeCounting {
	public static void main(String[] args) throws Exception{
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = scanner.readLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		int[] arr = new int[n+1];
		String[] s = scanner.readLine().trim().split(" ");
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(s[i-1]);
		}
		int[] a = new int[n+1];
		
		String[] temp = scanner.readLine().trim().split(" ");
		a[1] = 1;
		
		for(int j = 1; j <= n-1; j++) {
			int parent = Integer.parseInt(temp[j]);
			if(a[2*j] == 0) {
				a[2*j] = arr[j+1];
			}
			else {
				a[(2*j)+1] = arr[j + 1];
			}
		}
		
		int count = 0;
		
		
	}
}
