class Solution {
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
            maxSumLeaf(root);
        return maxSum;
        
    }
    int maxSumLeaf(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=maxSumLeaf(root.left);
        int right=maxSumLeaf(root.right);
        int curr=Math.max(Math.max(left,right)+root.val,root.val);
        maxSum=Math.max(maxSum,Math.max(curr,left+right+root.val));
        return curr;
        
    }
}


// Input: root = [1,2,3]
// Output: 6
// Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
  

// Input: root = [-10,9,20,null,null,15,7]
// Output: 42
// Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
  
