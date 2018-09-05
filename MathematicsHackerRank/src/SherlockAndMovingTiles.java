import java.util.*;
public class SherlockAndMovingTiles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		long l = Long.parseLong(str[0]);
		long s1 = Long.parseLong(str[1]);
		long s2 = Long.parseLong(str[2]);
		
		long qu = Long.parseLong(scanner.nextLine().trim());
		
		for(int i = 0; i < qu; i++) {
			long q = Long.parseLong(scanner.nextLine().trim());
			
			long diff = Math.abs(s2 - s1);
//			double den = Math.abs((s2*s2) - (s1*s1)) * Math.abs((s2*s2) - (s1*s1));
			double t = (Math.sqrt(2) * (l - Math.sqrt(q)))/ diff;
			System.out.println(t);
		}
	}
}
