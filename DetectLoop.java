class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        if(head.next==null)return false;
        Node slow=head;
        Node fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}

// N = 3
// value[] = {1,3,4}
// x = 2
// Output: True
