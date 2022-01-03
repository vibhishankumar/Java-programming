/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void subArray(int[] arr,int sum)
    {
        int start=0,curr=0,end=0;
        Map<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            curr+=arr[i];
            if(curr-sum==0)
            {
                start=0;
                end=i;
                break;
            }
            if(hs.containsKey(curr-sum))
            {
                start=hs.get(curr-sum)+1;
                end=i;
                break;
            }
            hs.put(curr,i);
        }
        if(end==0)
        {
            System.out.println("No found");
        }else{
            System.out.println(start+" "+ end);
        }
        
    }
	public static void main (String[] args) {
		int[] arr = {10, 2, -2, -20, 10};
        int n = arr.length;
        int sum = -10;
        subArray(arr,sum);
	}
}
//0 3
