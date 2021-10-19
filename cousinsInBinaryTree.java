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
    //will find level
    int level(TreeNode node ,int x,int lev)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.val==x)
        {
            return lev;
        }
        int l=level(node.left,x,lev+1);
        if(l!=0)return l;
        
        return level(node.right,x,lev+1);
    }
    //find sibling either same or not
    boolean isSibling(TreeNode node,int x,int y)
    {
        if(node==null) 
        {
            return false;
        }
        if(node.left==null)
        {
          isSibling(node.right,x,y);  
        }
        if(node.right==null)
        {
           isSibling(node.left,x,y); 
        }
        return ((node.left!=null&&node.left.val==x&&node.right!=null&&node.right.val==y)||
               (node.left!=null&&node.left.val==y&&node.right!=null&&node.right.val==x)||
               isSibling(node.left,x,y)||
               isSibling(node.right,x,y));
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        //two node should be on same level having different parent
        
        return ((level(root,x,1)==level(root,y,1))&&(!isSibling(root,x,y)));
        
    }
