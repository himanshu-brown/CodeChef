/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MagicalDoors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        
		        String s = scan.next();
		        int move=1,magic=0;
		        
		        for(int i=0; i<s.length(); i++){
		            
		            if(s.charAt(i)=='0' && move==1){
		                move=0;
		                magic++;
		            }
		            if(s.charAt(i)=='1' && move==0){
		                move=1;
		                magic++;
		            }
		            
		        }
		        
		        System.out.println(magic);
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
		
	}
}
