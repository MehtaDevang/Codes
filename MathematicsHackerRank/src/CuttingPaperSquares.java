import java.util.*;
public class CuttingPaperSquares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		long n = Long.parseLong(str[0]);
		long m = Long.parseLong(str[1]);
		
		long total_cuts = (n*m) - 1;
		System.out.println(total_cuts);
	}
}
