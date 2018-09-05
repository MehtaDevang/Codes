import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayPairs {

    // Complete the solve function below.
    static long solve(long[] arr) {
    	long count = 0;
    	
    	for(int i = 0; i < arr.length - 1; i++) {
    		long max = arr[i];
    		for(int j = i + 1; j < arr.length; j++) {
    			if(arr[j] > max) {
    				max = arr[j];
    			}
    			if(arr[i] * arr[j] <= max) {
    				count++;
    			}
    		}
    	}
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int arrCount = Integer.parseInt(scanner.nextLine());
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] arr = new long[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        long result = solve(arr);
        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
