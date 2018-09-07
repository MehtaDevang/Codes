import java.math.BigInteger;
import java.util.*;
public class SherlockAndPermutations {
	public static BigInteger fact(int n) {
		BigInteger val = new BigInteger("1");
		while(n > 1) {
			val = val.multiply(new BigInteger(n + ""));
			n--;
		}
		return val;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = 0; i < t; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			BigInteger fact = fact(m+n-1);
			BigInteger n_fact = fact(n);
			BigInteger m_fact = fact(m-1);			
			BigInteger result = fact.divide(n_fact.multiply(m_fact));
			System.out.println(result.mod(new BigInteger("1000000007")));
		}
		scanner.close();
	}
}
