import java.util.*;
public class MinimumHeightTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		long b = Long.parseLong(str[0]);
		long a = Long.parseLong(str[1]);
		long num = a * 2;
		int h;
		if(num % b == 0) {
			h = (int)(num / b);
		}
		else {
			h = (int)(num / b) + 1;
		}
		System.out.println(h);
	}
}
