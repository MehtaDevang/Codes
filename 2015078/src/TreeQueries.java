import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class TreeQueries {
	public static void main(String[] args) throws Exception{
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = scanner.readLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		
		String[] temp = scanner.readLine().trim().split(" ");
		int[] arr = new int[n];
 		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		for(int i = 0; i < q; i++) {
			String[] s = scanner.readLine().trim().split(" ");
			int num1 = Integer.parseInt(s[0]);
			if(num1 == 1) {
				int node_no = Integer.parseInt(s[1]);
				int level = Integer.parseInt(s[2]);
				int node_index = (int)Math.pow(2, level-1) - 1;
				System.out.println(arr[node_index + node_no - 1]);
			}
			else if(num1 == 2) {
				int l = Integer.parseInt(s[1]);
				int r = Integer.parseInt(s[2]);
				int start = (int)Math.pow(2, l-1) - 1;
				int x = (int)Math.pow(2, r-1) - 1;
				int node = (int) Math.pow(2, r-1);
				int end_index = x + node;
				int sum = 0;
				if(end_index < arr.length) {
					for(int index = start; index < end_index; index++) {
						sum = sum + arr[index];
					}
				}
				else {
					for(int index = start; index < arr.length; index++) {
						sum = sum + arr[index];
					}
				}
				System.out.print(sum);
			}
			else {
				int node_no = Integer.parseInt(s[1]);
				int level = Integer.parseInt(s[2]);
				int val = Integer.parseInt(s[3]);
				
				int start = (int)Math.pow(2, level-1) - 1;
				arr[start + node_no - 1] = val;
			}
		}
	}
}
