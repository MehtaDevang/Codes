import java.util.*;
public class NiceQueries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		long n = Long.parseLong(str[0]);
		long q = Long.parseLong(str[1]);
//		int[] arr = new int[n+1];
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i < q; i++) {
			String[] query = scanner.nextLine().trim().split(" ");
			int num = Integer.parseInt(query[0]);
			if(num == 1) {
				int index = Integer.parseInt(query[1]);
//				arr[index] = 1;
				set.add(index);
			}
			else {
				int index = Integer.parseInt(query[1]);
				boolean flag = false;
				for(Integer j : set) {
					if(j >= index) {
						System.out.println(j);
						flag = true;
						break;
					}
				}
				if(flag == false)
					System.out.println("-1");
			}
		}
	}
}
