/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrintSubArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    
		    int n = scan.nextInt();
		    int[] a = new int[n];
		    
		    for(int i=0; i<n; i++)
		        a[i] = scan.nextInt();
		        
		    int l = scan.nextInt();
		    int r = scan.nextInt();
		    
		    for(int i=l-1; i<r; i++)
		        System.out.print(a[i]+" ");
		}catch(Exception e){
		    return;
		}
	}
}

