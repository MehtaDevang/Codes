import java.math.BigInteger;
import java.util.*;
public class SummingTheNSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = 0; i < t; i++) {
			String n = scanner.nextLine().trim();
			
			BigInteger num = new BigInteger(n);
			BigInteger sum = num.multiply(num);
			BigInteger mod_val = new BigInteger("1000000007");
			sum = sum.mod(mod_val);
			System.out.println(sum);
		}
	}
}
