import java.util.*;
public class AlienLanguage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String jh = scanner.nextLine().trim();
			String ja = scanner.nextLine().trim();
			
			if(jh.contains(ja)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
