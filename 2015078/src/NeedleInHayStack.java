import java.sql.Time;
import java.util.*;
public class NeedleInHayStack {
//	static HashSet<String> set = new HashSet<>();
//	static String text = "";
//	static boolean f = false;
//	public static void permutation(String str) { 
//	    permutation("", str);
////	    System.out.println("Hello" + " " + f);
//	    if(f == false) {
//	    	System.out.println("NO");
//	    }
//	}
//
//	private static void permutation(String prefix, String str) {
//	    int n = str.length();
//	    if (n == 0) {
//	    	if(text.contains(prefix)) {
//	    		System.out.println("YES");
//	    		f = true;
//	    		return;
//	    	}
//	    }
//	    else {
//	        for (int i = 0; i < n; i++)
//	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
//	    }
//	}
//	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String pattern = scanner.nextLine().trim().replace(" ", "");
			String text = scanner.nextLine().trim().replace(" ", "");
			int len = pattern.length();
			String rev = "";
			for(int j = len-1; j >=0; j--) {
				rev = rev + pattern.charAt(j);
			}
			if(text.contains(pattern) || text.contains(rev)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
