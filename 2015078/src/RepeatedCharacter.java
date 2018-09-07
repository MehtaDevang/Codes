import java.util.*;
public class RepeatedCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			HashMap<Character, Integer> map = new HashMap<>();
			String str = scanner.nextLine();
			char[] c = str.toCharArray();
			int index = 0;
			int val;
			int min = 10000;
			boolean flag = false;
			for(char ch : c) {
				if(!map.containsKey(ch)) {
					map.put(ch,index);
				}
				else {
					flag = true;
					val = map.get(ch);
					if(val < min) {
						min = val;
					}
				}
				index++;
			}

			if(flag == true)
				System.out.println(c[min]);
			else {
				System.out.println("-1");
			}
		}
	}
}
