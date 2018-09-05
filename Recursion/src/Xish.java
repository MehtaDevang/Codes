import java.util.*;
public class Xish {
	HashSet<Character> set = new HashSet<>();
	HashSet<Character> set2 = new HashSet<>();
 	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Xish obj = new Xish();
		
		obj.checkXish(scanner.next(), scanner.next());
		
		boolean res = obj.set.containsAll(obj.set2);
		System.out.println(res);
	}
	
	public String checkXish(String str, String s) {
		if(str.equals("") && s.equals("")) {
			return str;
		}
		else if(s.equals("")) {
			set.add(str.charAt(0));
			return checkXish(str.substring(1), "");
		}
		else {
			set.add(str.charAt(0));
			set2.add(s.charAt(0));
			return checkXish(str.substring(1), s.substring(1));
		}
	}
}
