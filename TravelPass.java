/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TravelPass
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int N = scan.nextInt();
		        int A = scan.nextInt();
		        int B = scan.nextInt();
		        
		        String s = scan.next();
		        int total = 0;
		        
		        for(int i=0; i<N; i++){
		            
		            if(s.charAt(i)=='0') total += A;
		            else total += B;
		            
		        }
		        
		        System.out.println(total);
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}

