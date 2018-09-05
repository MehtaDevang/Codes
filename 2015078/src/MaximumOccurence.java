import java.util.*;
public class MaximumOccurence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim().replace(" ", "");
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c) + 1);
			}
		}
		
		int max_val = 0;
		boolean flag = false;
		char max = 'z';
		
		for(char ch : map.keySet()) {
			if(flag== false) {
				max = ch;
				max_val = map.get(ch);
				flag = true;
			}
			else {
				if(map.get(ch) > max_val) {
					max = ch;
					max_val = map.get(ch);
				}
				else if(map.get(ch) == max_val) {
					if(ch < max) {
						max = ch;
					}
				}
//				System.out.println(ch + " " + map.get(ch));
			}
		}
		
		System.out.println(max + " " + max_val);
	}
}
