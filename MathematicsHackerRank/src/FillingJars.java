import java.math.BigInteger;
import java.util.*;
public class FillingJars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		long n = Long.parseLong(str[0]);
		long m = Long.parseLong(str[1]);
		long sum = 0;
		for(int i = 0; i < m; i++) {
			String[] s = scanner.nextLine().trim().split(" ");
			long a = Long.parseLong(s[0]);
			long b = Long.parseLong(s[1]);
			long k = Long.parseLong(s[2]);
			long limit = b-a+1;
			long mul = limit * k;
			sum = sum + mul;
		}
		System.out.println(sum/n);
	}
}
