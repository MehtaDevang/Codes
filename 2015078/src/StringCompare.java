import java.util.*;
public class StringCompare {
	
	public static int compare(String str1, String str2) {
		int res = 0;
		int val1 = 0;
		int val2 = 0;
		int i = 0;
		while(i < str1.length()) {
			if(str1.charAt(i) == 'n' && str1.charAt(i+1) == 'g') {
				val1 = val1 + 14;
				i = i + 2;
			}
			else if(str1.charAt(i) <= 'n' ) {
				val1 = val1 + (str1.charAt(i) - 'a');
				i++;
			}
			else if(str1.charAt(i) >= 'o'){
				val1 = val1 + (str1.charAt(i) - 'a');
				i++;
			}
//			System.out.println(val1);
		}
		i = 0;
		while(i < str2.length()) {
			if(str2.charAt(i) == 'n' && str2.charAt(i+1) == 'g') {
				val2 = val2 + 14;
				i = i + 2;
			}
			else if(str2.charAt(i) < 'n' || str2.charAt(i) == 'n') {
				val2 = val2 + (str2.charAt(i) - 'a');
				i++;
			}
			else if(str2.charAt(i) > 'o' || str2.charAt(i) == 'o'){
				val2 = val2 + 1 + (str2.charAt(i) - 'a');
				i++;
			}
			System.out.println(val2);
		}
		System.out.println(val1 + "  " + val2);
		if(val1 == val2) {
			res = 0;
		}
		else if(val1 > val2) {
			res = 1;
		}
		else {
			res = -1;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String[] temp = scanner.nextLine().trim().split(" ");
			String str1 = temp[0];
			String str2 = temp[1];
			
			int val = compare(str1, str2);
			System.out.println(val);
		}
	}
}
