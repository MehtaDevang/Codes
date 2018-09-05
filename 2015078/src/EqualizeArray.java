import java.util.*;
public class EqualizeArray {
	static HashMap<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] str = scanner.nextLine().trim().split(" ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int max = 0;
		for(int e : map.keySet()) {
			int val = map.get(e);
			if(val > max) {
				max = val;
			}
		}
		System.out.println(arr.length - max);
	}
}
