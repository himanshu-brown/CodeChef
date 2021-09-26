/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefInVaccinationQueue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int n = scan.nextInt();
		        int p = scan.nextInt();
		        int x = scan.nextInt();
		        int y = scan.nextInt();
		        int[] a = new int[n];
		        int after = 0;
		        
		        for(int i=0; i<n; i++) a[i] = scan.nextInt();
		        
		        for(int i=0; i<p; i++){
		            if(a[i] == 0) after += x;
		            else after += y;
		        }
		        
		        System.out.println(after);
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
		
	}
}
