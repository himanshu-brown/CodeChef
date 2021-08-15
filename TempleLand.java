/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TempleLand
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
		        
		        int desired = 1, pattern=1;
		        
		        for(int i=0; i<n; i++)
		            a[i] = scan.nextInt();
		        
		        if(n%2 == 0)
		            System.out.println("no");
		        else{
		            int i=0;
		            for(i=0; i<=n/2; i++){
		                if(desired != a[i]){
		                    pattern=0;
		                    break;
		                }
		                desired++;
		            }
		            desired -= 2;
		            if(pattern==1){
		                    for(int j=i; j<n; j++){
		                if(desired != a[j]){
		                    pattern=0;
		                    break;
		                }
		                desired --;
		            }
		            }
		             if(pattern == 1) System.out.println("yes");
		            else System.out.println("no");
		        }
		       
		    }
		}catch(Exception e){
		    return;
		}
	}
}

