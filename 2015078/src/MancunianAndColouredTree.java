import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class MancunianAndColouredTree {
	public static void main(String[] args) throws Exception{
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = scanner.readLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int c = Integer.parseInt(str[1]);
		
		int[] arr = new int[n+1];
		int[] a = new int[n+1];
		arr[0] = 1;
		String[] temp = scanner.readLine().trim().split(" ");
		String[] t = scanner.readLine().trim().split(" ");
		a[1] = Integer.parseInt(t[0]);
//		String[] colour = scanner.readLine().trim().split(" ");
		for(int i = 2; i <= n; i++) {
			arr[i] = Integer.parseInt(temp[i-2]);
			a[i] = Integer.parseInt(t[i-1]);
		}
		
		for(int i = 1; i <= n; i++) {
			int close = -1;
			int num = a[i];
			int j;
			if(i % 2 == 0) {
				j = (i)/ 2;
			}
			else {
				j = (i-1)/2;
			}
			for(int k = j; k >= 0;) {
				if(a[k] == num) {
					close = k+1;
					break;
				}
				if(k % 2 == 0) {
					k = (k)/ 2;
				}
				else {
					k = (k-1)/2;
				}
			}
			System.out.print(close + " ");
		}
	}
}
