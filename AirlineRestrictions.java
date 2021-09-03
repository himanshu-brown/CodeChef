/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AirlineRestrictions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int A = scan.nextInt();
		        int B = scan.nextInt();
		        int C = scan.nextInt();
		        int D = scan.nextInt();
		        int E = scan.nextInt();
		        
		        if((A+B<=D&&C<=E) || (B+C<=D&&A<=E) || (A+C<=D&&B<=E))
		            System.out.println("YES");
		        else System.out.println("NO");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}

