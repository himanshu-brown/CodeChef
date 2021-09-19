/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CarsAndBikes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int test = scan.nextInt();
		    
		    while(test-- != 0){
		        
		        int n = scan.nextInt();
		        
		        if(n%4 == 2) System.out.println("YES");
		        else System.out.println("NO");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}
