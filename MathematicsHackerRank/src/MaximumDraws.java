import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MaximumDraws {

    /*
     * Complete the maximumDraws function below.
     */
    static int maximumDraws(int n) {
        /*
         * Write your code here.
         */
        return n+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = maximumDraws(n);
            
            System.out.println(result);
        }
    }
}
