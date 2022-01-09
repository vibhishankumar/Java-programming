import java.io.*;
import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Map<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(mp.containsKey(s.charAt(i)))
			{
				mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
			}
			else{
				mp.put(s.charAt(i),1);
			}
		}
		String res="";
		for(int i=0;i<s.length();i++)
		{
			// if(mp.get(s.charAt(i))!=0))
			
			if(mp.get(s.charAt(i))!=0)
			{
				res+=mp.get(s.charAt(i));
				res+=s.charAt(i);
				 System.out.print(s.charAt(i));
			   System.out.print(mp.get(s.charAt(i)));
			   mp.put(s.charAt(i),0);

			}
              
		}
		System.out.println("");
		System.out.print(res);
	}
}
// a1b1h1i21124
// 1a1b1h2i1142
