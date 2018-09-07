import java.util.*;
public class Restaurant {
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		for(int i = 0; i < t; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			int l = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int area = l * b;
			int min = Math.min(l, b);
			int max = Math.max(l, b);
			int gcd = gcd(max, min);
			System.out.println((area)/(gcd * gcd));
			
		}
	}
}
