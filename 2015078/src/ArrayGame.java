import java.util.*;
public class ArrayGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		
		int len1 = Integer.parseInt(str[0]);
		int len2 = Integer.parseInt(str[1]);
		
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		
		String[] temp = scanner.nextLine().trim().split(" ");
		String[] temp2 = scanner.nextLine().trim().split(" ");
		
		for(int i = 0; i < len1; i++) {
			arr1[i] = Integer.parseInt(temp[i]); 
		}
		
		for(int i = 0; i < len2; i++) {
			arr2[i] = Integer.parseInt(temp2[i]);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int count = 0;
		int max = arr2[len2 - 1];
		int val = arr1[0];
		int iterations = 0;
		iterations = max - val;
		System.out.println(iterations);
	}
}
