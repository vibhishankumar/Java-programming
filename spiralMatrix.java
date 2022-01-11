// Java program for the above approach
import java.util.*;

class Solution {

    // Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(left<right&&top<bottom)
        {
        for(int i=left;i<right;i++)
        {
            ans.add(matrix[top][i]);
        }
        top++;
         for(int i=top;i<bottom;i++)
        {
            ans.add(matrix[i][right]);
        }
        right--;
          for(int i=right;i>=left;i--)
         {
            ans.add(matrix[bottom][i]);
         }
         bottom--;
         for(int i=bottom;i>=top;i--)
         {
            ans.add(matrix[i][left]);
         } 
        left++;
        }
        return ans;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };

        System.out.println(spiralOrder(a));
    }
}
// o/p [1, 2, 3, 8, 12, 15, 14, 13, 9, 5, 6, 10]
