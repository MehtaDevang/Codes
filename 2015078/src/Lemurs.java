import java.util.*;
public class Lemurs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		int count = 0;
		int each = n/k;
		n = n % k;
		while(n <= k) {
			if((k - n) > n && (k-n) >= each) {
				count = n;
			}
			else if((k - n) > n && (k-n) < each){
				count = count + k - n;
			}
			else if(k == n) {
				break;
			}
			else {
				if(k-n < n && n < each) {
					count = count + n;
					continue;
				}
				k--;
				n = n + each;
				count++;
			}
		}
		System.out.println(count);
		
	}
}
