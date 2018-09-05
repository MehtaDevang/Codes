import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class LuckyMinimum {
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(scanner.readLine().trim());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.readLine().trim());
			
			String[] str = scanner.readLine().trim().split(" ");
			long[] arr = new long[n];
			arr[0] = Long.parseLong(str[0]);
			long min = arr[0];
			int freq = 1;
			for(int j = 1; j < n; j++) {
				arr[j] = Long.parseLong(str[j]);
				if(arr[j] < min) {
					min = arr[j];
					freq = 1;
				}
				else if(arr[j] == min) {
					freq++;
				}
			}
			if(freq % 2 == 1) {
				System.out.println("Lucky");
			}
			else {
				System.out.println("Unlucky");
			}
		}
	}
}
