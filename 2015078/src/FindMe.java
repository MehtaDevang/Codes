import java.util.*;
public class FindMe {
	
	public static int calc(int n) {
		int index = 2;
		int res = 0;
		while(true) {
			int t = n * index;
			int sum = 0;
			String str = Integer.toString(t);
			char[] c = str.toCharArray();
			for(int j = 0; j < c.length; j++) {
				sum = sum + Integer.parseInt(c[j] + "");
			}
			if(sum == n) {
				return t;
			}
			index++;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		int x = calc(n);
		System.out.println(x);
	}
}
