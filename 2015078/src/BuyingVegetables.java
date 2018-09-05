import java.lang.*;
import java.io.*;
import java.util.*;
class BuyingVegetables
{
    public static int getmin(int a[],int l,int h)
    {
        int min=Integer.MAX_VALUE;
        for(int i=l;i<=h;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        return min;
    }
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t>0)
	    {
	        int n=in.nextInt();
	        int arr[][]=new int[n][3];
	        int i,j;
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<3;j++)
	            arr[i][j]=in.nextInt();
	        }
	        int dp[][]=new int[n][3];
	        for(i=0;i<3;i++)
	        dp[0][i]=arr[0][i];
	        for(i=1;i<n;i++)
	        {
	            for(j=0;j<3;j++)
	            dp[i][j]=Math.min(getmin(dp[i-1],0,j-1),getmin(dp[i-1],j+1,2))+arr[i][j];
	        }
	        int ans=getmin(dp[n-1],0,2);
	        System.out.println(ans);
	        t--;
	    }
	}
}