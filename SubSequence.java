/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class SubSequence{
    public static ArrayList<String> getSS(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> t=new ArrayList<>();
            t.add("");
            return t;
        }
        char c=str.charAt(0);
        String temp=str.substring(1);
        ArrayList<String> res=getSS(temp);
        ArrayList<String> ans=new ArrayList<>();
        for(String a:res)
        {
            ans.add(""+a);
        }
        for(String a:res)
        {
            ans.add(c+a);
        }
        return ans;
    }
	public static void main (String[] args) {
		String s="abc";
		System.out.println(getSS(s));
	}
}
// i/p string="abc"
//   o/p [, c, b, bc, a, ac, ab, abc]
