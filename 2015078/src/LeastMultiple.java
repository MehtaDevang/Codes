import java.util.*;
public class LeastMultiple {
	
	private static long gcd(long a, long b)
	{
//		System.out.println(a + " " + b);
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	
	private static long lcm(long a, long b)
	{
	    return a * (b / gcd(a, b));
	}

	private static long lcm(long[] input)
	{
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			long[] arr = new long[n];
			for(int j = 0; j < n; j++) {
				arr[j] = j+1;
			}
			long res = lcm(arr);
			System.out.println(res);
		}
	}
}
