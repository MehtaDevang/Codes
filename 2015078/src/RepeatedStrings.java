import java.util.*;
public class RepeatedStrings {
	
	public static int count(String str) {
		int n = str.length();
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int length = s.length();
		long n = scanner.nextLong();
		String str = "";
		long index = n/length;
		for(long i = 0; i < index; i++) {
			str = str + s;
		}
		int remaining = (int)(n - (length * index));
		str = str + s.substring(0, remaining);
		
		int count_a = count(str);
		System.out.println(count_a);
	}
}
