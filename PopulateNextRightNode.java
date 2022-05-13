/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        //BFS O(n) space O(n) bcz of need to store each node in queue
        if(root==null)return root;
//         Queue<Node> q=new LinkedList<>(); sol 1
//         q.add(root);
//         while(!q.isEmpty())
//         {
//             int size=q.size();
//             Node temp=new Node(0);
//             while(size-->0)
//             {
//                 Node node=q.poll();
//                 temp.next=node;
//                 temp=temp.next;
//                 if(node.left!=null)
//                 {
//                     q.add(node.left);
//                 }
//                 if(node.right!=null)
//                 {
//                     q.add(node.right);
//                 }
                
//             }
//         }
//         return root;
        //sol without space
        Node head=root;
        while(head!=null)
        {
            Node dummy=new Node(0);
            Node temp=dummy;
            while(head!=null)
            {
                if(head.left!=null)
                {
                    temp.next=head.left;
                    temp=temp.next;
                }
                if(head.right!=null)
                {
                    temp.next=head.right;
                    temp=temp.next;
                }
                head=head.next;
            }
            head=dummy.next;
        }
        return root;
        
    }
}

// Input: root = [1,2,3,4,5,null,7]
// Output: [1,#,2,3,#,4,5,7,#]
// Explanation: Given the above binary tree (Figure A), your function should populate
// each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order
// as connected by the next pointers, with '#' signifying the end of each level.
