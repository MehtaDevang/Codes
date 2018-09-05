import java.util.*;
public class ConnectingTowns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = Integer.parseInt(scanner.nextLine().trim());
        
        for(int i = 0; i < t; i++) {
            long n = Long.parseLong(scanner.nextLine().trim());
            String[] str = scanner.nextLine().trim().split(" ");
            long routes = 1;
            for(int j = 0; j < str.length; j++) {
                routes = (routes * Long.parseLong(str[j])) % 1234567;
            }
            System.out.println(routes);
        }
    }
}