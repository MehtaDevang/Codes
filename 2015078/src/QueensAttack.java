import java.util.*;
public class QueensAttack {
	public static void count(int[][] arr, int p, int q) {
		int len = arr[0].length;
		int i = p;
		int j = q;
		long sum = 0;
		if(len == 1) {
			System.out.println(0);
			return;
		}
		// for left move
		while(--j > 0) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		i = p;
		j = q;
		//for right move
		while(++i < len) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		
		//for up move
		i = p;
		j = q;
		while(--i > 0) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		
		//for down move
		i = p;
		j = q;
		while(++j < len) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		
		//for top left move
		i = p;
		j = p;
		while(--i > 0 && --j > 0) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		
		// for top right move
		i = p;
		j = q;
		while(++i < len && --j > 0) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		
		// for bottom left move
		i = p;
		j = q;
		while(++i < len && --j > 0) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		
		// for bottom right move
		i = p;
		j = q;
		while(++i < len && ++j < len) {
//			System.out.println(i + " " + j);
			if(arr[i][j] == 0) {
				sum++;
			}
			else {
				break;
			}
		}
		
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		String[] pos = scanner.nextLine().trim().split(" ");
		int p = Integer.parseInt(pos[0]);
		int q = Integer.parseInt(pos[1]);
		
		int[][] arr = new int[n+1][n+1];
		for(int i = 0; i < k; i++) {
			String[] s = scanner.nextLine().trim().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			arr[x][y] = 1;
		}
		
		count(arr, p, q);
	}
}
