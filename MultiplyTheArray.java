/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MultiplyTheArray
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
		        long product = 1;
		        
		        for(int i=0; i<n; i++){
		            a[i] = scan.nextInt();
		            product *= a[i];
		        }
		        
		        System.out.println(product);
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}

