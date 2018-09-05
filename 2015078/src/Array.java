import java.util.*;
public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {1,2,7,5,7,4,1,1,2,5};
		int count = 0;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
