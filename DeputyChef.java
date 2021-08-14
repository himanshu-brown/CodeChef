/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DeputyChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        int max=-1;
		        int n = scan.nextInt();
		        int[] a = new int[n];
		        int[] d = new int[n];
		        
		        for(int i=0; i<n; i++)
		            a[i] = scan.nextInt();
		        for(int i=0; i<n; i++)
		            d[i] = scan.nextInt();
		            
		        for(int i=0; i<n; i++){
		            int left=i-1;
		            int right = i+1;
		            if(i==0) left = n-1;
		            if(i==n-1) right=0;
		            
		            if(a[left]+a[right] < d[i])
		                max = Math.max(max,d[i]);
		        }
		        System.out.println(max);
		    }
		}catch(Exception e){
		    return;
		}
	}
}

