import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

    class ClosestNumber {
            public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);
                int T = sc.nextInt();

                for(int I = 0;I<T;I++){
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    
                    if(n==0)
                        System.out.println(0);
                    else if(n>0){
                            if(m>0){
                                int x = n/m;
                                    x = x*m;
                                int y = n/m + 1;
                                    y = y*m;
                                if(Math.abs(n-x)<Math.abs(n-y)){
                                    System.out.println(x);
                                }
                                else    System.out.println(y);
                            }
                            else{
                                int x = n/m;
                                    x = x*m;
                                int y = n/m - 1;
                                    y = y*m;
                                if(Math.abs(n-x)<Math.abs(n-y)){
                                    System.out.println(x);
                                }
                                else    System.out.println(y);
                            }
                    }
                    else{
                        if(m>0){
                            int x = n/m;
                            x = x*m;
                            int y = n/m - 1;
                                y = y*m;
                            if(Math.abs(Math.abs(n)-Math.abs(x))<Math.abs(Math.abs(n)-Math.abs(y))){
                                System.out.println(x);
                            }
                            else    System.out.println(y);
                        }
                        else{
                            int x = n/m;
                            x = x*m;
                            int y = n/m + 1;
                            y = y*m;
                            if(Math.abs(Math.abs(n)-Math.abs(x))<Math.abs(Math.abs(n)-Math.abs(y))){
                             System.out.println(x);
                            }
                            else    System.out.println(y);
                        }
                    }
                }
    }
    }