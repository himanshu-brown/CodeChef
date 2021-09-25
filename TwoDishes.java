/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoDishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int n = scan.nextInt();
		        int a = scan.nextInt();
		        int b = scan.nextInt();
		        int c = scan.nextInt();
		        
		        if( n<=a+c && n<=b ) System.out.println("YES");
		        else System.out.println("NO");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}
