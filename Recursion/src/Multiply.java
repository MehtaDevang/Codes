import java.util.*;
public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Multiply obj = new Multiply();
		
		int result = obj.multiply(scanner.nextInt(), scanner.nextInt());
		
		System.out.println(result);
	}
	
	public int multiply(int a, int b) {
		if(b < 1) {
			return 0;
		}
		else {
			return a + multiply(a, b-1);
		}
	}
}
