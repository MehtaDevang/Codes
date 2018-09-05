import java.util.*;
public class Elfish {
	HashSet<Character> set = new HashSet<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Elfish obj = new Elfish();
		
		obj.checkElfish(scanner.next());
		boolean res = obj.set.contains('e') && obj.set.contains('l') && obj.set.contains('f');
		System.out.println(res);
	}
	
	public String checkElfish(String str) {
		if(str.equals("")) {
			return str;
		}
		else if(str.charAt(0) == 'e' || str.charAt(0) == 'l' || str.charAt(0) == 'f') {
			set.add(str.charAt(0));
			return checkElfish(str.substring(1));
		}
		else {
			return checkElfish(str.substring(1));
		}
	}
}
