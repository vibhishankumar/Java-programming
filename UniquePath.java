class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        //for 1st col there will be only 1 way to reach
        for(int i=0;i<m;i++)
        {
            dp[i][0]=1;
        }
        //for 1st row there will be only 1 way to reach
        for(int i=0;i<n;i++)
        {
            dp[0][i]=1;
        }
        //for i and jth position total number of way to reach will be sum
        //of i,j-1) and (i-1,j)th position
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
               dp[i][j]=dp[i-1][j]+dp[i][j-1]; 
            }
        }
        return dp[m-1][n-1];
    }
}
// Input: m = 7, n = 3
// Output: 28
// Input: m = 3, n = 3
// Output: 6
