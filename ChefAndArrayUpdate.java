/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndArrayUpdate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int minValue = Integer.MAX_VALUE;
		    int[] a = new int[n];
		    
		    for(int i=0; i<n; i++){
		        a[i] = scan.nextInt();
		    }
		    Arrays.sort(a);
		    
		    System.out.println(k-a[0]);
		    
		}catch(Exception e){
		    return;
		}
	}
}

