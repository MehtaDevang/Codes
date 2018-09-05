import java.util.*;
public class FindFine {
	
	public static int calculate(int[] cars, int[] fine, int date, int n) {
		int sum = 0;
		if(date % 2 == 0) {
			for(int i = 0; i < n; i++) {
				if(cars[i] % 2 == 0) {
					continue;
				}
				sum = sum + fine[i];
			}
		}
		else {
			for(int i = 0; i < n; i++) {
				if(cars[i] % 2 != 0) {
					continue;
				}
				sum = sum + fine[i];
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String[] temp = scanner.nextLine().trim().split(" ");
			int n = Integer.parseInt(temp[0]);
			int date = Integer.parseInt(temp[1]);
			int[] cars = new int[n];
			int[] fine = new int[n];
			String[] str = scanner.nextLine().trim().split(" ");
			for(int j = 0; j < n; j++) {
				cars[j] = Integer.parseInt(str[j]);
			}
			String[] str2 = scanner.nextLine().trim().split(" ");
			for(int j = 0; j < n; j++) {
				fine[j] = Integer.parseInt(str2[j]);
			}
			int total = calculate(cars, fine, date, n);
			System.out.println(total);
		}
	}
}
