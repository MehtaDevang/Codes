import java.util.*;
public class AllVowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		String str = scanner.nextLine().trim().replace(" ", "");
		HashSet<Character> set = new HashSet<>();
		String res = "YES";
		for(char c : str.toCharArray()) {
			if(set.contains(c)) {
				continue;
			}
			else {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					set.add(c);
				}
				else {
					continue;
				}
			}
		}
		if(set.size() == 5) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
