// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newC)
    {
        // Code here 
        //int[][] res=new int[image.length][image[0].length];
        int prevC=image[sr][sc];
        if(prevC==newC)
        {
            return image;
        }
        floodFillHelper(image,sr,sc,prevC,newC);
        return image;
        
    }
   public void floodFillHelper(int[][] image,int sr,int sc,int prevC,int newC)
   {
       if(sr<0||sr>=image.length||sc<0||sc>=image[0].length)
       {
           return;
       }
       if(image[sr][sc]!=prevC)
       {
           return;
       }
       image[sr][sc]=newC;
       floodFillHelper(image,sr-1,sc,prevC,newC);
       floodFillHelper( image,sr+1,sc,prevC,newC);
       floodFillHelper(image,sr,sc-1,prevC,newC);
       floodFillHelper(image,sr,sc+1,prevC,newC);
   }
}

// Input: image = {{1,1,1},{1,1,0},{1,0,1}},
// sr = 1, sc = 1, newColor = 2.
// Output: {{2,2,2},{2,2,0},{2,0,1}}
