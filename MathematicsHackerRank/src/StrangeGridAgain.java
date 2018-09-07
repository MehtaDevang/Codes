import java.util.*;
public class StrangeGridAgain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		long r = Long.parseLong(str[0]);
		int c = Integer.parseInt(str[1]);
		long even_count = 0;
		long odd_count = 0;
		long result = 0;
		if(r % 2 != 0) {
			even_count = (((r-1)/2) * 2 * 5) - 2;
			if(even_count <= 0) {
				result = (2 * c) - 2;
			}
			else {
				result = even_count + (2 * c);
			}
		}
		else {
			odd_count = (((r/2) - 1) * 10) - 1;
			if(odd_count == 0) {
				result = (2 * c) - 1;
			}
			else {
				result = odd_count + (2 * c);
			}
		}
		System.out.println(result);
	}
}
