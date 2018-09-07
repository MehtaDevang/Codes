import java.util.*;
public class WaysToN {
	public int calcWays(int n) {
		return calc(n);
	}
	
	public int calc(int n) {
	    if(n < 0) {
	    	return 0;
	    }
		else if(n == 0) {
			return 1;
		}
		else if(n == 1 || n == 2) {
			return 1;
		}
		else if( n == 3) {
			return 2;
		}
		else{
			return calc(n-1) + calc(n-3) + calc(n-4);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		WaysToN obj = new WaysToN();
		int way = obj.calcWays(n);
		System.out.println(way);
	}
}
