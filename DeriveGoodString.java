/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DeriveGoodString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    
		    while(t-- != 0){
		        String s = scan.next();
		        HashSet<Character> set = new HashSet<>();
		        int count=0;
		        
		        for(int i=0; i<s.length(); i++){
		            if(set.contains(s.charAt(i))) count++;
		            else{
		                
		                set.add(s.charAt(i));
		            } 
		        }
		        
		        System.out.println(count);
		        
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
}

