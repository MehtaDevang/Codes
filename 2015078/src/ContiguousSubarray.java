import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class ContiguousSubarray {
	public static void main(String[] args) throws Exception{
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		
		int t = scanner.read();
		for(int i = 0; i < t; i++) {
			int n = scanner.read();
			
			String[] str = scanner.readLine().trim().split(" ");
			int[] arr = new int[n];
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(str[j]);
			}
			int max = 0;
			for(int j = 0; j < n; j++) {
				int count = 0;
				for(int k = j; k < n; k++) {
					if(arr[k] % 2 == 0) {
						count++;
					}
					else {
						break;
					}
				}
				if(count > max) {
					max = count;
				}
			}
			if(max == 0)
				max = -1;
			System.out.println(max);
		}
	}
}
