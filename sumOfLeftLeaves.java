/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        helper(root,false);//to find left node and sum of leftnode
        return sum;
    }
    public void helper(TreeNode root,boolean isleftLeave)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null&&isleftLeave==true)
        {
            sum+=root.val;
        }
        helper(root.left,true);
        helper(root.right,false);
    }
}
// Input: root = [3,9,20,null,null,15,7]
// Output: 24
