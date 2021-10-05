/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WhichMixture
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int A = scan.nextInt();
		        int B = scan.nextInt();
		        
		        if(0<A && 0<B) System.out.println("Solution");
		        else if(A==0) System.out.println("Liquid");
		        else System.out.println("Solid");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
		
	}
}
