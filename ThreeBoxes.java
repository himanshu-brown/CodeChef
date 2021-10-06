/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ThreeBoxes
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int A = scan.nextInt();
		        int B = scan.nextInt();
		        int C = scan.nextInt();
		        int D = scan.nextInt();
		        
		       if(A+B+C <= D) System.out.println("1");
		       else if(A+C <= D || A+B <= D) System.out.println("2");
		       else System.out.println("3");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
		
	}
}
