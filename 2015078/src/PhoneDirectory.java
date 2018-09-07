import java.util.*;
public class PhoneDirectory {
	
	public static void printStrings(String[] str, String s) {
		for(int i = 0; i < s.length(); i++) {
			ArrayList<String> array = new ArrayList<>();
			boolean flag = false;
			for(String c : str) {
				if(c.startsWith(s.substring(0, i+1))) {
					array.add(c);
					flag = true;
				}
			}
			if(flag == false) {
				System.out.print("0");
			}
			else {
				Collections.sort(array);
				for(String k : array) {
					System.out.print(k + " ");
				}
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			String[] str = scanner.nextLine().trim().split(" ");
			String test = scanner.nextLine();
			printStrings(str, test);
		}
	}
}
