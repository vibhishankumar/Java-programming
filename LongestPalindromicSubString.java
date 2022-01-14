class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] table=new boolean[n][n];
        int maxLength=0;
        for(int i=0;i<n;i++)
        {
            table[i][i]=true;
            maxLength=1;
        }
        //for length 2
         int start =0;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                table[i][i+1]=true;
                start=i;
                maxLength=2;
            }
        }
        //length >3
        for(int k=3;k<=n;++k)
        {
            for(int i=0;i<n-k+1;i++)
            {
                //start index i with length k
                //ending index j
                int j=i+k-1;
                if(table[i+1][j-1]&&s.charAt(i)==s.charAt(j))
                {
                    table[i][j]=true;
                    start=i;
                    if(k>maxLength)
                    {
                      maxLength=k;  
                    }
                }
            }
        }
        return s.substring(start,start+maxLength);
        
        
    }
}

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
