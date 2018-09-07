import java.util.*;
public class MergeStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			String[] temp = scanner.nextLine().trim().split(" ");
			String s1 = temp[0];
			String s2 = temp[1];
			int k = 0;
			int j = 0;
			String str = "";
			boolean flag = false;
			while(k < s1.length() && j < s2.length()) {
				if(flag == false) {
					str = str + s1.charAt(k);
					k++;
					flag = true;
				}
				else {
					str = str + s2.charAt(j);
					j++;
					flag = false;
				}
			}
			if(k < s1.length()) {
				str = str + s1.substring(k);
			}
			if(j < s2.length()) {
				str = str + s2.substring(j);
			}
			System.out.println(str);
		}
	}
}
