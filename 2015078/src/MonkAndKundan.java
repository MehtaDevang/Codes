import java.util.*;
public class MonkAndKundan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		String init = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i < t; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			ArrayList<String> list = new ArrayList<>();
			
			int len = str.length;
			int sum = 0;
			for(int j = 0; j < len; j++) {
				int index = 0;
				for(char c : str[j].toCharArray()) {
					int val = index + init.indexOf(c+"");
					sum = sum + val;
					index++;
				}
			}
			System.out.println(sum * len);
		}
	}
}
