import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GCD obj = new GCD();
		
		int res = obj.calculateGCD(scanner.nextInt(), scanner.nextInt());
		System.out.print(res);
	}
	
	public int calculateGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return calculateGCD(b, a%b);
		}
	}
}
