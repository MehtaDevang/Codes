import java.util.*;
public class MaximizeEarning {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int s = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < s; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			
			String[] temp = scanner.nextLine().trim().split(" ");
			int max = 0;
			int count = 0;
			for(int j = 0; j < n; j++) {
				int height = Integer.parseInt(temp[j]);
				if(height > max) {
					count++;
					max = height;
				}
			}
			System.out.println(count * k);
		}
	}
}
