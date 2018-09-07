import java.util.*;
public class HamiltonianAndLagrangian {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine().trim());
		
		String[] str = scanner.nextLine().trim().split(" ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		ArrayList<Integer> list = new ArrayList<>();
				
		for(int i = 0; i < n; i++) {
			int val = arr[i];
			boolean flag = true;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				list.add(arr[i]);
			}
		}
		
		for(Integer num : list) {
			System.out.print(num + " ");
		}
		
	}
}
