import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int len = expenditure.length;
        if(len <= d){
            return -1;
        }
        else{
            // Arrays.sort(expenditure);
            int count = 0;
            int median = 0;
            int index1 = 0;
            int index2 = d-1;
            int[] arr = new int[d];
            for(int i = 0; i < d; i++){
                arr[i] = expenditure[i];
            }
            for(int i = d; i < len; i++){
                int[] temp = arr;
                Arrays.sort(temp);
                median = temp[d/2];
                if(expenditure[i] >= (2 * median)){
                    count++;
                }
                for(int j = 0; j < arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
                arr[d-1] = expenditure[i];
            }
            return count;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	Scanner scanner = new Scanner(System.in);
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
