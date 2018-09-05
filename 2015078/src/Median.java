import java.util.*;
public class Median {
	
	public static int median(ArrayList<Integer> arr) {
		int median = 0;
		int len = arr.size();
		Collections.sort(arr);
		if(len % 2 == 0) {
			int mid1 = (len/2)-1;
			int mid2 = (len/2);
			median = (arr.get(mid1) + arr.get(mid2))/2;
		}
		else {
			median = arr.get(len/2);
		}
		
		return median;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			int data = scanner.nextInt();
			array.add(data);
			System.out.println(median(array));
		}
	}
}
