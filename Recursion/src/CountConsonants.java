import java.util.*;
public class CountConsonants {
	int count = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CountConsonants obj = new CountConsonants();
		
		String str = scanner.nextLine();
		
		int len = str.length();
		
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
				obj.count++;
			}
		}
		System.out.println(obj.count);
	}
}
