/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ThatIsMyScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        int total = 0;
		        int n = scan.nextInt();
		        int[] p = new int[n];
		        int[] s = new int[n];
		        
		        for(int i=0; i<n; i++){
		            p[i] = scan.nextInt();
		            s[i] = scan.nextInt();
		        }
		        
		        int[] points = new int[11];
		        for(int i=0; i<n; i++){
		            if(p[i] < 9 && points[p[i]] < s[i]){
		                points[p[i]] = s[i];
		            }
		        }
		        
		        for(int i=0; i<11; i++)
		            total += points[i];
		            
		        System.out.println(total);
		        
		    }
		}catch(Exception e){
		    return;
		}
	}
}

