import java.util.*;
public class SpecialMultiples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine().trim());
			int multiple = 1;
			long res = 1;
			while(true) {
				long num = n * multiple;
				long temp = num;
				System.out.println(temp);
				boolean flag = false;
				if(num % n == 0) {
					while(num > 0) {
						if(num % 10 == 9 || num % 10 == 0) {
							num = num /10;
							continue;
						}
						else {
							flag = true;
							break;
						}
					}
					if(flag == false) {
						res = temp;
						break;
					}
					else {
						multiple++;
					}					
				}
				else {
					multiple++;
				}
			}
			System.out.println(res);
		}
	}
}
