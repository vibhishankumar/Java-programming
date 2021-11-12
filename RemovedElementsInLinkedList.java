/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //if head itself  containing key
        //we need to remove key and duplicate
        ListNode temp=head,prev=null;
        while(temp!=null&&temp.val==val)
        {
            head=temp.next;
            temp=head;
        }
        //find occurence other then head if present
        while(temp!=null)
        {
            while(temp!=null&&temp.val!=val)
            {
                prev=temp;
                temp=temp.next;
            }
            if(temp==null)
            {
                return head;
            }
            prev.next=temp.next;
            temp=prev.next;
        }
        return head;
    }
}
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]
