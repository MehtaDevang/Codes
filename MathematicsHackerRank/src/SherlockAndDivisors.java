import java.util.*;
public class SherlockAndDivisors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = 0; i < t; i++) {
			long count = 0;
			long n = Long.parseLong(scanner.nextLine().trim());
			for(int j = 1; j <= Math.sqrt(n); j++) {
				if(n % j == 0) {
					long second = n / j;
					if(j % 2 == 0) {
						count++;
					}
					if(second % 2 == 0 && second != j) {
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}
}
