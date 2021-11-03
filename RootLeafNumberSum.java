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
    int totalSum;
    public int sumNumbers(TreeNode root) {
        totalSum=0;
        if(root==null)
        {
            return 0;
        }
        helperSum(root,0);//To calculate total sum
        return totalSum;
        
    }
    public void helperSum(TreeNode root,int sum)
    {
        if(root==null)return;
        sum=sum*10+root.val;
        if(root.left==null&&root.right==null)
        {
            totalSum+=sum;
        }
        helperSum(root.left,sum);//left tree
        helperSum(root.right,sum);// right tree
    }
}
//i/p root=[1,2,3]
//o/p 25
// Input: root = [4,9,0,5,1]
// Output: 1026
