import java.util.*;
public class Mittal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().trim().split(" ");
		int[][] arr = new int[10][10];
		//1 opaque
		//0 porous
		//storing the wall
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(scanner.nextLine().trim());
			}
		}
		
		//applying the method for calculation
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				if(arr[i][j-1] == 1 && arr[i][j+1] == 1 && arr[i+1][j-1] == 0 && arr[i+1][j] == 1 && arr[i+1][j+1] == 1) {
					continue;				}
				if(arr[i][j] == 1) {
					continue;
				}
				else {
					arr[i][j] = arr[i-1][j] * arr[i][j+1] * arr[i][j-1] * arr[i-1][j+1] * arr[i-1][j+1];
					if(arr[i][j] == 1) {
						continue;
					}
					arr[i][j] = arr[i+1][j-1] * arr[i+1][j] * arr[i+1][j+1];
				}
			}
		}
		
		//checking 
		int row = 0;
		boolean flag = false;
		for(int col = 0; col < 4; col++) {
			if(arr[row][col] == 0) {
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("There is no way");
		}
		else {
			System.out.println("There is a way");
		}
	}
}
