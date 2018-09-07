import java.util.*;
public class MarkTheAnswer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		
		long[] arr = new long[n];
		String[] s = scanner.nextLine().trim().split(" ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		boolean skipped = false;
		long score = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] <= x) {
				score++;
			}
			else if(arr[i] > x && skipped == false) {
				skipped = true;
			}
			else {
				break;
			}
		}
		System.out.println(score);
	}
}
