import java.util.*;
public class RaisePower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RaisePower obj = new RaisePower();
		float a = scanner.nextFloat();
		int b = scanner.nextInt();
		float result;
		if(b >= 0) {
			result = obj.raise(a, b);
		}
		else {
			result = obj.raise2(a, b);
		}
		System.out.println(result);
	}
	
	public float raise(float a, int b) {
		if(b < 1) {
			return 1;
		} 
		else {
			return a *raise(a, b-1);
		}
	}
	
	public float raise2(float a, int b) {
		if(b > -1) {
			return 1;
		}
		else {
			return Math.abs(1/a) * raise2(a, b+1);
		}
	}
}
