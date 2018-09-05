import java.util.*;
public class Statistics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		HashSet<String> set = new HashSet<>();
		HashMap<String, Integer> map = new HashMap<>();
		int count = 0;
		int max = 0;
		boolean flag = false;
		String s = "";
		for(int i = 0; i < n; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			String sport = str[1];
			String name = str[0];
			if(set.contains(name)) {
				continue;
			}
			else {
				set.add(name);
				if(!map.containsKey(sport)) {
					if(flag == false) {
						flag = true;
						max = 1;
						s = sport;
					}
					if(max == 1 && sport.compareTo(s) < 0) {
						s = sport;
					}
					map.put(sport, 1);
					if(sport.equals("football")) {
						count++;
					}
				}
				else {
					map.put(sport, map.get(sport) + 1);
					if(sport.equals("football")) {
						count++;
					}
					if(map.get(sport) > max) {
						max = map.get(sport);
						s = sport;
					}
					if(map.get(sport) == max) {
						if(sport.compareTo(s) < 0) {
							s = sport;
						}
					}
				}
			}
		}
		System.out.println(s);
		System.out.println(count);
	}
}
