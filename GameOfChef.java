/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GameOfChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        int n = scan.nextInt();
		        int[] a = new int[n];
		        int maxSum = 0, currSum=0;
		        
		        for(int i=0; i<n; i++)
		            a[i] = scan.nextInt();
		            
		        for(int i=0; i<n; i++){
		           currSum = Math.max(0,currSum+a[i]);
		           maxSum = Math.max(maxSum,currSum);
		        }
		        
		        System.out.println(maxSum);
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}

