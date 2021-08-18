/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LongLongSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    long sum=0;
		    int[] array = new int[t];
		    
		    for(int i=0; i<t; i++){
		        
		        array[i] = scan.nextInt();
		        sum += array[i];
		    }
		    System.out.println(sum);
		}catch(Exception e){
		    return;
		}
	}
}

