import java.util.*;
public class HandShakes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = 0; i < t; i++) {
			long n = Long.parseLong(scanner.nextLine().trim());
			if(n == 0 || n == 1) {
				System.out.println("0");
				continue;
			}
			System.out.println((n * (n-1)) / 2);
		}
	}
}
