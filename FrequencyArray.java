/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FrequencyArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        int n = scan.nextInt();
		        int[] a = new int[n];
		        HashSet<Integer> set = new HashSet<>();
		        boolean flag = true;
		        
		        for(int i=0; i<n; i++)
		            a[i] = scan.nextInt();
		            
		        for(int i=0; i<n; i++){
		            if(!set.contains(a[i])) set.add(a[i]);
		            else{
		                flag=false;
		                break;
		            }
		        }
		        
		        if(flag) System.out.println("prekrasnyy");
		        else System.out.println("ne krasivo");
		    }
		}catch(Exception e){
		    return;
		}
	}
}

