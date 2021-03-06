import java.util.*;
public class Festivals {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			HashMap<String, ArrayList<Integer>> map = new HashMap<>();
			HashMap<String, Integer> result = new HashMap<>();
			for(int j = 0; j < n; j++) {
				String[] str = scanner.nextLine().trim().split(" ");
				String fest = str[0];
				int cost = Integer.parseInt(str[1]);
				ArrayList<Integer> set = new ArrayList<>();
				if(!map.containsKey(fest)) {
					set.add(cost);
					map.put(fest, set);
				}
				else {
					ArrayList<Integer> s = new ArrayList<>();
					s = map.get(fest);
					s.add(cost);
					map.put(fest, s);
				}
			}
			int max = 0;
			String temp = "";
			
			for(ArrayList<Integer> list : map.values()) {
				Collections.sort(list, Collections.reverseOrder());
			}
			
			for(String s : map.keySet()) {
				ArrayList<Integer> x = map.get(s);
				int sum = 0;
				if(x.size() >= 3) {
					for(int index = 0; index < 3; index++) {
						sum = sum + x.get(index);
					}
					if(sum > max) {
						max = sum;
						temp = s;
					}
					else if(sum == max) {
						if(s.compareTo(temp) < 0) {
							temp = s;
						}
					}
				}
				else {
					int index = 0;
					while(index < x.size()) {
						sum = sum + x.get(index);
						index++;
					}
					if(sum > max) {
						max = sum;
						temp = s;
					}
					else if(sum == max) {
						if(s.compareTo(temp) < 0) {
							temp = s;
						}
					}
				}
			}
			System.out.println(map);
		}
	}
}
