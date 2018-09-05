import java.util.*;
public class PalindromicSequences {
	
	public static HashSet<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PalindromicSequences obj = new PalindromicSequences();
		String str = scanner.next();
		int n = str.length();
		obj.makeSequences1(str);
		
	}
	
	public void makeSequences1(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++) {
				if(palindrome(str.substring(i, j+1)) == true) {
					System.out.println(str.substring(i, j+1));
				}
			}
		}
	}
	
//	public void makeSequences2(String str, int start, int n) {
//		if(n > start) {
//			String s = str.substring(start, n-1);
//			makeSequences1(str, start, n-1);
//			palindrome(s);
//		}
//		else {
//			return;
//		}
//	}
//	public void makeSequences3(int n) {
//		
//	}
//	
	public static boolean palindrome(String str) {
//		System.out.println("hi");
		int len = str.length();
		int i = 0, j = len-1;
		char[] c = str.toCharArray();
		while(i != j) {
			if(c[i] != c[j])
				break;
			i++;
			j--;
		}
	
		if(i == j) {
			if(!set.contains(str)) {
				set.add(str);
				return true;
			}
		}
		return false;
	}
}
