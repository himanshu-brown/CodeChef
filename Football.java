/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Football
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int totalPoint = 0, maxPoint=Integer.MIN_VALUE;
		        
		        int n = scan.nextInt();
		        int[] S = new int[n];
		        int[] F = new int[n];
		        
		        for(int i=0; i<n; i++)
		            S[i] = scan.nextInt();
		            
		        for(int i=0; i<n; i++)
		            F[i] = scan.nextInt();
		           
		        for(int i=0; i<n; i++){
		            totalPoint = ((S[i]*20) - (F[i]*10));
		            if(totalPoint < 0) totalPoint = 0;
		            if(totalPoint >= maxPoint){
		                maxPoint = totalPoint;
		            }
		        }
		        System.out.println(maxPoint);
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}

