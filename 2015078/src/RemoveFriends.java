import java.util.*;
public class RemoveFriends {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = 0; i < t; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			ArrayList<Integer> arr = new ArrayList<>();
			String[] temp = scanner.nextLine().trim().split(" ");
			for(int j = 0; j < n; j++) {
				arr.add(Integer.parseInt(temp[j]));
			}
			int count = 0;
			while(count < k) {
				boolean delete = false;
				for(int j = 0; j < arr.size() - 1; j++) {
					if(arr.get(j) < arr.get(j+1)) {
						arr.remove(j);
						count++;
						delete = true;
						break;
					}
				}
				if(delete == false)
					arr.remove(arr.size() - 1);
			}
			
			for(Integer val : arr) {
				System.out.print(val + " ");
			}
			System.out.println("\n");
		}
	}
}
