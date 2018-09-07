import java.util.*;
public class KKandCrush {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			String[] str = scanner.nextLine().trim().split(" ");
			HashSet<Integer> set = new HashSet<>();
			for(int j = 0; j < str.length; j++) {
				int num = Integer.parseInt(scanner.nextLine());
				set.add(num);
			}
			
			int k = Integer.parseInt(scanner.nextLine());
			int[] arr = new int[k];
			for(int j = 0; j < k; j++) {
				arr[j] = scanner.nextInt();
				System.out.println(arr[j]);
				if(set.contains(arr[j])) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
		}
	}
}
