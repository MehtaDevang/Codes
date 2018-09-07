import java.util.*;
public class SumSelected {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			String[] temp = scanner.nextLine().trim().split(" ");
			ArrayList<Integer> arr = new ArrayList<>();
			for(int j = 0; j < n; j++) {
				arr.add(Integer.parseInt(temp[j]));
			}
//			Collections.sort(arr);
			int sum = 0;
			int k;
			while(!arr.isEmpty()) {
				Integer obj = Collections.max(arr);
				int max = Collections.max(arr);
				int index = arr.indexOf(max);
				sum = sum + max;
//				arr.remove(max);
//				arr.remove(max - 1);
				arr.remove(obj);
				arr.remove(new Integer(max-1));
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}
