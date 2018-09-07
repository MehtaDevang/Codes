import java.util.*;
public class Max {
	
	public static int calc(String str, char c) {
		int val = 0;
		char[] arr = str.toCharArray();
		int first = -1;
		int second = -1;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == c) {
				if(first == -1) {
					first = i;
				}
				else if(second == -1) {
					second = i;
					max = second - first;
				}
				else {
					first = second;
					second = i;
					int diff = second - first;
					if(diff > max) {
						max = diff;
					}
				}
			}
		}
		if(max == 0) {
			return -1;
		}
		else {
			return max;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner .nextLine().trim().split(" ");
		String val = "";
		for(String s : str) {
			val = val + s;
		}
		System.out.println(val);
		char c = scanner.next().charAt(0);
																																																																																																																																																																		
		int len = calc(val, c);
		System.out.println(len);
		
	}
	
	
}
