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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {
            return root; //null
        }
        else if(root.val<key)
        {
            root.right=deleteNode(root.right, key);
            return root;
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
            return root;
        }
        else{
            //root.val==key
            
            if(root.left==null&&root.right==null)
            {
                return null;
            }
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else{
                TreeNode nextMin=root.right;
                while(nextMin.left!=null)
                {
                    nextMin=nextMin.left;
                }
                nextMin.left=root.left;
                return root.right;
            }
        }
        
    }
}

//Example 1:

// Input: root = [5,3,6,2,4,null,7], key = 3
// Output: [5,4,6,2,null,null,7]
// Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
// One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
