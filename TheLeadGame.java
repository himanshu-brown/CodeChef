/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheLeadGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int p1=0, p2=0, player=0, currLead=0, maxLead=Integer.MIN_VALUE, finalPlayer=0;
		
		for(int i=0; i<n; i++){
		    p1 += scan.nextInt();
		    p2 += scan.nextInt();
		    if(p1 > p2){
		        currLead = p1 - p2;
		        player = 1;
		    }else{
		        currLead = p2 - p1;
		        player = 2;
		    }
		    if(currLead > maxLead){
		        maxLead = currLead;
		        finalPlayer = player;
		    }
		}
		
		System.out.print(finalPlayer+" "+maxLead);
		}catch(Exception e){
		    return;
		}
	}
}

