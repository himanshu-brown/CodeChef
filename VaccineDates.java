/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VaccineDates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        int d = scan.nextInt();
		        int l = scan.nextInt();
		        int r = scan.nextInt();
		        
		        if(l<=d && d<=r) System.out.println("Take second dose now");
		        else if(d < l) System.out.println("Too Early");
		        else System.out.println("Too Late");
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}
