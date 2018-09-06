import java.util.*;
public class HalloweenParty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = 0; i < t; i++) {
			long max = 0;
			long k = Long.parseLong(scanner.nextLine().trim());
			int index = 1;
			while(index <= k/2) {
				long index2 = k - index;
				long val = index * index2;
				if(val > max) {
					max = val;
				}
				index++;
			}
			System.out.println(max);
		}
	}
}
