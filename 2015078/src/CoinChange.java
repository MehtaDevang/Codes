import java.util.*;
class CoinChange {
    HashMap<Integer, Integer> map = new HashMap<>();
    public  int count(int[] arr, int n) {
        return countWays(arr, arr.length, n);
    }
    static int flag = 10;
    static int k = 0;
    public  int countWays(int[] arr,int m, int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        if (m <=0 && n >= 1)
            return 0;
        
        return countWays(arr, m - 1, n ) + countWays( arr, m, n-arr[m-1]);
    }
    
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[] temp = scanner.nextLine().trim().split(" ");
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        CoinChange obj = new CoinChange();
        int c = obj.count(arr, n);
        System.out.println(c);
    }
}
