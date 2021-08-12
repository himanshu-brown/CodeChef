/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LittleElephantAndCandies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int total = 0;
		        
		        int n = scan.nextInt();
		        int c = scan.nextInt();
		        
		        int[] elephant = new int[n];
		        
		        for(int i=0; i<n; i++){
		            elephant[i] = scan.nextInt();
		            total += elephant[i];
		        }
		        
		        if(total <= c) System.out.println("Yes");
		        else System.out.println("No");
		        
		    }
		}catch(Exception e){
		    return;
		}
	}
}

