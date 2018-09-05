import java.util.*;
public class HalloweenSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().trim().split(" ");
        int p = Integer.parseInt(str[0]);
        int d = Integer.parseInt(str[1]);
        int m = Integer.parseInt(str[2]);
        int s = Integer.parseInt(str[3]);
        int total = 0;
        if(s < p) {
        	System.out.println("0");
        }
        else {
        	while(s > 0 && s >= m) {
                if(p > m) {
                	if(s >= p) {
//                		System.out.println("Entered");
                		total++;
                        s = s - p;
                        p = p - d;
                	}
                	else {
                		break;
                	}
                }
                else {
                    s = s - m;
                    total++;
                }
            }
        	System.out.println(total);
        }
    }
}