class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}
// LinkedList: 1->2->3->4->5->6
// Output: 6 5 4 3 2 1
