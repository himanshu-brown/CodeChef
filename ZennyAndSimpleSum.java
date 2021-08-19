/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ZennyAndSimpleSum
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
		        
		        for(int i=0; i<n; i++)
		            a[i] = scan.nextInt();
		            
		        HashSet<Integer> h1 = new HashSet<>();
		        HashSet<Integer> h2 = new HashSet<>();
		        
		        int positive=0, negative=0;
		        
		        for(int i=0; i<n; i++){
		            if(a[i]>0 && !h1.contains(a[i])){
		                h1.add(a[i]);
		                positive += a[i];
		            } 
		            if(a[i]<0 && !h2.contains(a[i])){
		                h2.add(a[i]);
		                negative += a[i];
		            } 
		        }
		        
		        System.out.println(positive+" "+negative);
		    }
		}catch(Exception e){
		    return;
		}
	}
}

