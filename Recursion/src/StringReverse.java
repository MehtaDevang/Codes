import java.util.*;
public class StringReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringReverse obj = new StringReverse();
		
		String str = obj.reverse(scanner.nextLine());
		System.out.println(str);
	}
	
	public String reverse(String s) {
		if(s.equals("")) {
			return s;
		}
		else {
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}
}
