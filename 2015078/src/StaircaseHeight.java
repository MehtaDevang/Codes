import java.util.*;
public class StaircaseHeight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			int count = 0;
			int req = 1;
			while(n > 0) {
				n = n-req;
				if(n >=0)
					count++;
				req++;
			}
			System.out.println(count);
		}
	}
}
