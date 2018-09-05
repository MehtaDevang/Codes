
import java.util.*;
import java.lang.*;
import java.io.*;

class CommonCharacter {
    static void unCommon(String str1,String str2){
        String res="";
     //   String mod2="";
        int i,j,i1,j1;
        int n1=str1.length();
        int n2=str2.length();
        for(i=0;i<n1;i++){
            for(j=0;j<n2;j++){
                if(str1.charAt(i)==str2.charAt(j))
                    break;
              }
              if(j==n2){
                 res=res+str1.charAt(i);
            }
            
        }
     
        for(i1=0;i1<n2;i1++){
            for(j1=0;j1<n1;j1++){
                if(str1.charAt(j1)==str2.charAt(i1)){
                    break;
                }
              
            }
            if(j1==n1){
                 res=res+str2.charAt(i1);
              }
            
        }
        if(res.length()==0){
            System.out.print("-1");
        }else{
        System.out.print(res+" ");
    }
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T>0){
	    String str1=sc.next();
	    //System.out.println();
	    String str2=sc.next();
	    unCommon(str1,str2);
	    System.out.println();
	    T--;
	}
	}
}