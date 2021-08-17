/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MagicElements
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
		        int sum=0, count=0;
		        int[] A = new int[N];
		        for(int i=0; i<N; i++){
		            A[i] = scan.nextInt();
		            sum += A[i];
		        }
		            
		        for(int i=0; i<N; i++){
		            if(A[i]+K > sum-A[i]) count++;
		        }
		        
		        System.out.println(count);
		        
		    }
		}catch(Exception e){
		    return;
		}
	}
}

