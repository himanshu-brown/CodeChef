/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndArrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int n = scan.nextInt();
		        int[] A = new int[n];
		        int[] B = new int[n];
		        
		        for(int i=0; i<n; i++)
		            A[i] = scan.nextInt();
		            
		        for(int i=0; i<n; i++)
		            B[i] = scan.nextInt();
		            
		        for(int i=0; i<n; i++){
		           int new_num = A[i] > B[i] ? A[i]*10+B[i] : B[i]*10+A[i];
		           System.out.print(new_num+" ");
		        }
		        
		        System.out.println();
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}

