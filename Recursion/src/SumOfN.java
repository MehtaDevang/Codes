import java.util.*;
public class SumOfN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SumOfN obj = new SumOfN();
		
		int sum = obj.getSum(scanner.nextInt());
		System.out.println(sum);
	}
	
	public int getSum(int n) {
		if(n < 1) {
			return 0;
		}
		else {
			return n + getSum(n-1);
		}
	}
}
