import java.util.*;
public class PerfectPair {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		HashSet<Integer> square= new HashSet<>();
		HashSet<Integer> cube= new HashSet<>();
		
		for(int i = 1; i <= 32; i++) {
			square.add(i * i);
		}
		
		for(int i = 1; i <= 10; i++) {
			cube.add(i * i * i);
		}
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine().trim());
			String[] str = scanner.nextLine().trim().split(" ");
			int[] arr = new int[n+1];
			for(int j = 1; j <= n; j++) {
				arr[j] = Integer.parseInt(str[j-1]);
			}
			int count = 0;
			for(int row = 1; row <= n-1; row++) {
				for(int col = row + 1; col <= n; col++) {
					int val = arr[row] + arr[col];
//					int sq = (int)Math.sqrt(val); 
//					int cube = (int)Math.cbrt(val);
//					if(sq*sq == val) {
//						count++;
//						continue;
//					}
//					else if(cube*cube*cube == val) {
//						count++;
//						continue;
//					}
					
					if(square.contains(val)) {
						count++;
						continue;
					}
					else if(cube.contains(val)) {
						count++;
						continue;
					}
				}
			}
			System.out.println(count);
		}
	}
}
