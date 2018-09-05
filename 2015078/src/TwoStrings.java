import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	HashSet<Character> set1 = new HashSet<Character>();
    	HashSet<Character> set2 = new HashSet<Character>();
    	int len1 = s1.length();
    	int len2 = s2.length();
    	
    	for(int i = 0; i < len1; i++) {
    		set1.add(s1.charAt(i));
    	}
    	
    	for(int i = 0; i < len2; i++) {
    		set2.add(s2.charAt(i));
    	}
    	
    	if(len1 < len2) {
    		for(Character s : set1) {
    			if(set2.contains(s)) {
    				return "YES";
    			}
    		}
    	}
    	else {
    		for(Character s : set2) {
    			if(set1.contains(s)) {
    				return "YES";
    			}
    		}
    	}
    	return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }


        scanner.close();
    }
}
