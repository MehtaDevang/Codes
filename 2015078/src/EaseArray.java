import java.util.*;
public class EaseArray {
	
	public static int[] modify(int[] array) {
		int len = array.length;
		while(array[0] == 0) {
			for(int i = 0; i < len-1; i++) {
				array[i] = array[i+1];
			}
			array[len-1] = 0;
		}
		for(int i = 0; i < len-1; i++) {
			if(array[i] != 0 && array[i] == array[i+1]) {
				array[i] = array[i] * 2;
				array[i+1] = 0;
			}
			int count = 0;
			
			while(array[i+1] == 0) {
				boolean flag = false;
				for(int j = i+1; j < len-1; j++) {
					if(array[j] == 0 && array[j+1] == 0) {
						continue;
					}
					array[j] = array[j+1];
					flag = true;
				}
				if(flag == false) {
					break;
				}
				array[len-1] = 0;
//				System.out.println(array[i+1]);
			}
		}
//		System.out.print("Return");
		return array;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			String [] temp = scanner.nextLine().trim().split(" ");
			int[] array = new int[n];
			for(int j = 0; j < temp.length; j++) {
				array[j] = Integer.parseInt(temp[j]);
			}
			int[] arr = modify(array);
			for(int k = 0; k < n; k++) {
				System.out.print(arr[k] + " ");
			}
		}
	}
}
