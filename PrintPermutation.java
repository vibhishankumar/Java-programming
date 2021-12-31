
import java.io.*;

class GFG {
    public static void printPermutation(String str,String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);//strore char at index i
            String left=str.substring(0,i);strore string to left of index
            String right=str.substring(i+1);strore string from right of index to end
            String ros=left+right;             store
            printPermutation(ros,asf+ch);
        }
    }
    
	public static void main (String[] args) {
	    String s="abc";
	    printPermutation(s,"");
	}
}
// abc
// acb
// bac
// bca
// cab
// cba
