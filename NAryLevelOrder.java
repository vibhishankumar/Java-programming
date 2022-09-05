#BFS level order traversal
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
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> t=new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                Node temp=q.poll();
                t.add(temp.val);
                for(Node item : temp.children)
                {
                    q.add(item);
                }
            }
          res.add(t);

        }
        
        return res;
        
    }
}

Input: root = [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
