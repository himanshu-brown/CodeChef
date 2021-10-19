/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TestMatchSeries
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        int R1 = scan.nextInt();
		        int R2 = scan.nextInt();
		        int R3 = scan.nextInt();
		        int R4 = scan.nextInt();
		        int R5 = scan.nextInt();
		        
		        int win=0;
		        
		        if(R1==1) win++;
		        if(R1==2) win--;
		        
		        if(R2==1) win++;
		        if(R2==2) win--;
		        
		        if(R3==1) win++;
		        if(R3==2) win--;
		        
		        if(R4==1) win++;
		        if(R4==2) win--;
		        
		        if(R5==1) win++;
		        if(R5==2) win--;
		        
		        if(win==0) System.out.println("DRAW");
		        else if(win>0) System.out.println("INDIA");
		        else System.out.println("ENGLAND");
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
		
	}
}
