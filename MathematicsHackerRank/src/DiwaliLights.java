import java.math.BigInteger;
import java.util.*;
public class DiwaliLights {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine().trim());
			BigInteger c = new BigInteger("2");
			BigInteger patterns = (c.pow(n));
			patterns = patterns.subtract(new BigInteger("1"));
			patterns = patterns.mod(new BigInteger("100000"));
			System.out.println(patterns);
		}
		scanner.close();
	}
}
