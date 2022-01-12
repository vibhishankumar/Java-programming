/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		String s="absbabba";
		Map<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
		    //Character c=s.charAt(i);
		    if(mp.containsKey(s.charAt(i)))
		    {
		        mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
		    }
		    else{
		        mp.put(s.charAt(i),1);
		        
		    }
		    
		}
// 		for(Map.Entry<Character,Integer> entry:mp.entrySet())
// 		{
// 		    System.out.print(entry.getValue()+" "+entry.getKey());
		    
// 		}
        for(int i=0;i<s.length();i++)
        {
            if(mp.get(s.charAt(i))!=0)
            {System.out.print(s.charAt(i));
            System.out.print(mp.get(s.charAt(i)));
            mp.put(s.charAt(i),0);}
        }
		
		
	}
}
//a3b4s1
