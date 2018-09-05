/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i = 0; i < t; i++){
		    String str = scanner.next();
		    String ch = scanner.next();
		    char[] ch2 = ch.toCharArray();
		    char c = ch2[0];
		    int n = scanner.nextInt();
		    int count = 0;
		    int j = 0;
		    while(j < str.length()){
		    	if(count == n) {
		    		break;
		    	}
		        if(str.charAt(j) == c){
		            count++;
//		            System.out.println("true");
		        }
		        j++;
		    }
//		    System.out.println("Out");
		    if(count == n && j < str.length()-1){
		        System.out.println(str.substring(j));
		    }
		    else{
		        System.out.println("Empty string");
		    }
		}
	}
}