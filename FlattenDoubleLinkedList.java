/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> s=new Stack<>();
        Node temp=head;
        while(temp!=null)
        {
            if(temp.child!=null)
            {
                if(temp.next!=null)s.push(temp.next);
                temp.next=temp.child;
                temp.child.prev=temp;
                temp.child=null;
                temp=temp.next;
            }
            else if(temp.next!=null)
            {
              temp=temp.next;  
            }
            else if(!s.isEmpty()){
                Node st=s.pop();
                temp.next=st;
                st.prev=temp;
                temp=st;
            }
            else{
                temp=null;
            }
            
        }
       
        return head;
    }
}

// i/p [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
// o/p [1,2,3,7,8,11,12,9,10,4,5,6]

//   1---2---NULL
//   |
//   3---NULL
// o/p [1,3,2]
