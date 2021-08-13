/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KitchenTimetable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        int count=0;
		        int n = scan.nextInt();
		        int[] timeSlice = new int[n];
		        int[] timeRequired = new int[n];
		        
		        for(int i=0; i<n; i++)
		            timeSlice[i] = scan.nextInt();
		            
		        for(int i=0; i<n; i++)
		            timeRequired[i] = scan.nextInt();
		            
		        int temp=0;
		        for(int i=0; i<n; i++){
		            if(timeRequired[i] <= timeSlice[i]-temp)
		                count++;
		            temp=timeSlice[i];
		        }
		        
		        System.out.println(count);
		    }
		}catch(Exception e){
		    return;
		}
	}
}

