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
    //solution 1
//     private int maxDepth(TreeNode node)
//     {if (node == null)
//             return 0;
//         else
//         {
//             //compute the depth of each subtree
//             int lDepth = maxDepth(node.left);
//             int rDepth = maxDepth(node.right);
  
//             // use the larger one
//             if (lDepth > rDepth)
//                 return (lDepth + 1);
//              else
//                 return (rDepth + 1);
//         }
       
        
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null)
//         {
//             return 0;
//         }
//         int ld=diameterOfBinaryTree(root.left);//left sub tree diameter
        
//         int rd=diameterOfBinaryTree(root.right);//right sub tree diameter
        
//         int leftHeight=maxDepth(root.left);   //left subtree height
//         int rightHeight=maxDepth(root.right);//right subtree height
//         int f=leftHeight+rightHeight;        //total node
//         int dia=Math.max(f,Math.max(ld,rd));//finding of over all leftHeight and right with          //sub tree and max of ld and rd
//         return dia;
        
//     }
    //solution 2 with edge count
    public class DiaPairInfo{
        int ht;
        int dia;
    }
     public int diameterOfBinaryTree(TreeNode root){
         DiaPairInfo nodeInfo=findDiameter(root);
         return nodeInfo.dia;
     }
    public DiaPairInfo findDiameter(TreeNode root){
        if(root==null)
        {
            DiaPairInfo dInfo= new DiaPairInfo();
            dInfo.ht=-1;
            dInfo.dia=0;
            return dInfo;
        }
        //left subTree
        DiaPairInfo leftDiaInfo=findDiameter(root.left);
        //right sub tree
        DiaPairInfo rightDiaInfo=findDiameter(root.right);
        //Dia info for parant node
        DiaPairInfo parentDinfo=new DiaPairInfo();
        //setting height
        parentDinfo.ht=Math.max(leftDiaInfo.ht,rightDiaInfo.ht)+1;
        //diaMeter viaRoot including Edge only
        int diaViaRoot=leftDiaInfo.ht+rightDiaInfo.ht+2;
        parentDinfo.dia=Math.max(diaViaRoot,Math.max(leftDiaInfo.dia,rightDiaInfo.dia));
        return parentDinfo;
    }
}
//input   [1,2,3,4,5,6,7,8]
//out put 5
// [1,2,3,4,5] O/P  3
