import java.util.*;
public class MinimumDistances {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] str = scanner.nextLine().trim().split(" ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int min_dis = 100000;
		boolean flag = false;
		for(int i = 0; i < n-1; i++) {
			int dis = 0;
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					flag = true;
					dis = j - i;
					if(dis < min_dis) {
						min_dis = dis;
					}
					break;
				}
			}
		}
		if(flag == true)
			System.out.println(min_dis);
		else {
			System.out.println("-1");
		}
	}
}
