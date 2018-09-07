import java.util.*;
public class WordReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WordReverse obj = new WordReverse();
		
		String str = scanner.nextLine();
		String[] s = str.split(" ");
		String res = obj.reverse(s, 0);
		System.out.println(res);
	}
	
	public String reverse(String[] s, int index) {
		if(index >= s.length) {
			return "";
		}
		else {
			return reverse(s, index+1) + " " + s[index];
		}
		
	}
}
