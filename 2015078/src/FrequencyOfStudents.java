import java.util.*;
public class FrequencyOfStudents {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String str = scanner.nextLine().trim();
			if(!map.containsKey(str)) {
				map.put(str, 1);
			}
			else {
				map.put(str, map.get(str) + 1);
			}
		}
		TreeMap<String, Integer> tree = new TreeMap<>();
		tree.putAll(map);
		for(Map.Entry<String, Integer> entry : tree.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
