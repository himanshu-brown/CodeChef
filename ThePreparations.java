/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ThePreparations
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int m = scan.nextInt();
		        int n = scan.nextInt();
		        int k = scan.nextInt();
		        
		        if(n*k < m) System.out.println("YES");
		        else System.out.println("NO");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
		
	}
}
