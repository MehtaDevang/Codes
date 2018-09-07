import java.util.*;
public class StringLength {
	int count = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringLength obj = new StringLength();
		
		String str = scanner.nextLine();
		
		obj.count = obj.countLength(str, 0, str.length());
		System.out.println(obj.count);
	}
	
	public int countLength(String str, int start, int end) {
		if(start == end) {
			return 0;
		}
		else {
			return countLength(str, start+1, end) + 1;
		}
	}
}
