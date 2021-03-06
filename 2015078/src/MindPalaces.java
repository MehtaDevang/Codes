import java.util.*;
public class MindPalaces {
	public static void sortByRow(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}
	}
	
	public static void transpose(int[][] arr) {
		for(int i = 0; i < arr.length;i++) {
			for(int j = i+1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			String[] temp = scanner.nextLine().trim().split(" ");
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
		sortByRow(arr);
		transpose(arr);
		sortByRow(arr);
		transpose(arr);
		HashMap<Integer, String> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				String t = i + " " + j;
				map.put(arr[i][j], t);
			}
		}
		
		
		int q = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < q; i++) {
			int val = Integer.parseInt(scanner.nextLine());
			if(map.containsKey(val)){
				String[] s = map.get(val).trim().split(" ");
				System.out.println(s[0] + " " + s[1]);
			}
			else
				System.out.println("-1 -1");
		}
	}
}
