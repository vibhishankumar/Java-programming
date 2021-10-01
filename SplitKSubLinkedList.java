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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res=new ListNode[k];
        int tlen=0;
        ListNode tnode=head;
        while(tnode!=null)
        {
            tlen++;
            tnode=tnode.next;
        }
        int size=tlen/k;
        int distlen=tlen%k;
        ListNode node=head;
        ListNode prev=null;
        int i=0;
        while(node!=null && i<k)
        {
            res[i]=node;
            for(int j=0;j<size+(distlen>0?1:0);j++)
            {
                prev=node;
                node=node.next;
            }
            prev.next=null;
            i++;
            distlen--;
        }
        return res;
        
    }
}
