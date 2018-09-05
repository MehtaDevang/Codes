import java.util.*;
public class Steps {
	
	public static int func(int x, int y) {
		if(x < 1 || y < 1) {
			return 0;
		}
		else if(x == 1 &&  y == 1) {
			return 1;
		}
		else {
			return Math.min(func(x, y-x) + 1, func(x-y, y) + 1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());
		
		int steps = func(n, m);
		System.out.println(steps);
	}
}
