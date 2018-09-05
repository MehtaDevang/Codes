import java.util.*;
public class FindThePoint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < n; i++) {
			String[] str = scanner.nextLine().trim().split(" ");
			int px = Integer.parseInt(str[0]);
			int py = Integer.parseInt(str[1]);
			int qx = Integer.parseInt(str[2]);
			int qy = Integer.parseInt(str[3]);
			int rx;
			int ry;
			if(px < qx) {
				rx = qx + (qx - px);
			}
			else {
				rx = qx - (px - qx);
			}
			
			if(py < qy) {
				ry = qy + (qy - py);
			}
			else {
				ry = qy - (py - qy);
			}
			System.out.println(rx + " " + ry);
		}
	}
}
