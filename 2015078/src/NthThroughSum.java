import java.util.*;
import java.math.BigInteger;
public class NthThroughSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String[] size = scanner.nextLine().trim().split(" ");
			int m = Integer.parseInt(size[0]);
			int n = Integer.parseInt(size[1]);
			int[] arr1 = new int[m];
			int[] arr2 = new int[n]; 
			String[] a1 = scanner.nextLine().trim().split(" ");
			for(int j = 0; j < m; j++) {
				arr1[j] = Integer.parseInt(a1[j]);
			}
			String[] a2 = scanner.nextLine().trim().split(" ");
			for(int j = 0; j < n; j++) {
				arr2[j] = Integer.parseInt(a2[j]);
			}
			int s = Integer.parseInt(scanner.nextLine());
			long siz = m * n;
//			BigInteger value = new BigInteger(siz + "");
//			int[] res = new int[value];
			ArrayList<Integer> res = new ArrayList<>();
			int index = 0;
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < n;k++) {
					if(!res.contains(arr1[j] + arr2[k]))
						res.add(arr1[j] + arr2[k]);
				}
			}
			Collections.sort(res);
//			for(int a : res) {
//				System.out.print(a + " ");
//			}
			if(s > res.size()) {
				System.out.println("-1");
			}
			else
				System.out.println(res.get(s-1));
		}
	}
}
