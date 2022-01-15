// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String x,String y)
            {
                String xy=x+y;
                String yx=y+x;
                return yx.compareTo(xy);
            }
        });
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            ans+=arr[i];
        }
        return ans;
    }
}
// Input: 
// N = 4
// Arr[] = {54, 546, 548, 60}
// Output: 6054854654
// Explanation: Given numbers are {54, 546,
// 548, 60}, the arrangement 6054854654 
// gives the largest value.
