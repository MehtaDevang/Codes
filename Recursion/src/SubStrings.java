import java.util.*;
public class SubStrings {
	public static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SubStrings obj = new SubStrings();
		
		String str = scanner.nextLine();
//		System.out.println(str.substring(0, str.length()));
		for(int i = 0; i < str.length(); i++) {
			obj.makeSubStrings(str, i, str.length());
		}
		
		for(String s : set) {
			obj.checkPalindrome(s);
//			System.out.println(s);
		}
		
	}
	public void checkPalindrome(String s) {
		int len = s.length();
		char[] c = s.toCharArray();
		int i = 0; 
		int j = len-1;
		
		while(i != j) {
			if(c[i] != c[j]) {
				break;
			}
			i++;
			j--;
		}
		if(i == j) {
			System.out.println(s);
		}
	}
	
	public void makeSubStrings(String s, int start, int end) {
		if(start < end) {
			String str = s.substring(start, end);
			makeSubStrings(s, start, end-1);
			set.add(str);
		}
	}
}
