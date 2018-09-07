import java.util.*;
import java.math.BigInteger;
public class SumNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String[] temp = scanner.nextLine().trim().split(" ");
			BigInteger x = new BigInteger(temp[0]);
			BigInteger y = new BigInteger(temp[1]);
			
			BigInteger sum = x.add(y);
			int len1 = ("" + x).length();
			int len2 = ("" + sum).length();
			if(len1 == len2) {
				System.out.println(sum);
			}
			else {
				System.out.println(x);
			}
		}
	}
}
