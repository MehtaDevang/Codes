import java.util.*;
public class StringFormatter {  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = reverseWord(scanner.nextLine());
		System.out.println(s);
	}
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w : words){  
	        StringBuilder sb = new StringBuilder(w);  
	        sb.reverse();  
	        int len = w.length();
	        char c = Character.toUpperCase(sb.charAt(0));
	        char ch = Character.toLowerCase(sb.charAt(len-1));
 	        String s = sb.toString();
	        String temp = c + "";
	        String temp2 = ch + "";
	        s = temp + s.substring(1, len-1) + ch;
	        reverseWord+=s+" ";
	    }  
	    return reverseWord.trim();  
	}  
}  