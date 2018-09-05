import java.util.*;
public class SentenceDifficulty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < t; i++) {
			String str = scanner.nextLine();
			String[] words = str.trim().split(" ");
			int word = words.length;
			int hard = 0;
			int easy = 0;
			for(String s : words) {
				int count = 0;
				int constant = 0;
				int vowel = 0;
				int j = 0;
				boolean flag = false;
				while(j < s.length()) {
					char c = s.charAt(j);
					if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
						count = 0;
						vowel++;
					}
					else {
						count++;
						constant++;
					}
					
					if(count == 4) {
						flag = true;
						break;
					}
					j++;
				}
				if(flag == true) {
					hard++;
				}
				else if(vowel < constant) {
					hard++;
				}
				else {
					easy++;
				}
			}
			int difficulty = (5*hard) + (3*easy);
			System.out.println(difficulty);
		}
	}
}
