import java.util.*;
public class Duplicate {
	public static int[] check(int[] arr) {
		int[] a;
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
			else {
				if(!set2.contains(arr[i])) {
					set2.add(arr[i]);
					list.add(arr[i]);
				}
				else {
					continue;
				}
				
			}
		}
		int size = list.size();
		a = new int[size];
		int i = 0;
		for(int j : list) {
			a[i] = j;
			i++;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {4,4,7,8,8,9};
		
		int[] a = check(arr);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
