import java.util.*;
public class Semiprimes {
	static int count = 0;
	public static boolean checkComp(long n) {
		ArrayList<Integer> arr = new ArrayList<>();
		long tem = n;
		boolean flag = false;
		for(int i = 2; i <= n && n > 1; i++) {
			while(n % i == 0 && n > 1) {
				arr.add(i);
				n = n/i;
			}
		}
		int len = arr.size();
		if(len == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean check(long n) {
		boolean flag = false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				flag = true;
				break;
			}
			else {
				continue;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < t; i++) {
			long n = Integer.parseInt(scanner.nextLine());
			
			for(int j = 4; j < n; j++) {
				if(check(j)) {
					boolean flag = checkComp(j);
					if(flag) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
