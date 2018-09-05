import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			int k = 5;
			int count = 1;
			for(int j = i; count <= i; j = j + k ) {
				System.out.print(j + " ");
				k--;
				count++;
			}
			System.out.println("");
		}
	}
}
