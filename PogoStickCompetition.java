/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PogoStickCompetition
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        int N = scan.nextInt();
		        int K = scan.nextInt();
		        int[] A = new int[N];
		        int result=Integer.MIN_VALUE;
		        
		        for(int i=0; i<N; i++)
		            A[i] = scan.nextInt();
		            
		        for(int i=N-1; i>=0; i--){
		            if(i+K < N) A[i]+=A[i+K];
		            result = Math.max(result,A[i]);
		        }
		        System.out.println(result);
		    }
		}catch(Exception e){
		    return;
		}
	}
}

