/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LuckyNumber
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
		        
		        if(A==7 || B==7 || C==7) System.out.println("YES");
		        else System.out.println("NO");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
		
	}
}
