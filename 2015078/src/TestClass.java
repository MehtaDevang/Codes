/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < t; i++){
            int total_count = 0;
            String[] temp = scanner.nextLine().trim().split(" ");
            int n = Integer.parseInt(temp[0]);
            int d = Integer.parseInt(temp[1]);
            int[] arr = new int[n];
//            System.out.println("hello");
            String[] str = scanner.nextLine().trim().split(" ");
            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(str[j]);
            }

//            System.out.println(n + " " + d);
            for(int k = 0; k < n; k++){
//            	System.out.println("Entered Loop " + k);
                int s = 1;
                int mul = 1;
                int sum = 0;
                while(s <= d){
//                	System.out.println("Entered Loop " + k + " " + s);
                    sum = sum + 1;
                    s = ((mul*arr[k]) + 1);
                    mul = mul + 1;
                }
                total_count = total_count + sum;
//                System.out.println("sum" + sum);
            }
            System.out.println(total_count);
        }

    }
}
