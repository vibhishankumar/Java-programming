class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> s=new HashSet<>();
        Node curr=head;
        //Node fast=head;
        while(curr!=null)
        {
            s.add(curr);
            if(curr.next!=null&&s.contains(curr.next))
            {
                curr.next=null;
                return;
            }
            curr=curr.next;
        }
        
    }
}

// N = 3
// value[] = {1,3,4}
// X = 2
// Output: 1
