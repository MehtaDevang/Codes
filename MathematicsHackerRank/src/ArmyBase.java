import java.util.*;
public class ArmyBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
				
		int count1 = (n/2) + (n%2);
		int count2 = (m/2) + (m%2);
		System.out.println(count1 * count2);
	}
}
