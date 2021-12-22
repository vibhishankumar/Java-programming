class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         del.data=del.next.data;
         del.next=del.next.next;
    }
}

// Input:
// N = 2
// value[] = {1,2}
// node = 1
// Output: 2
// Explanation: After deleting 1 from the
// linked list, we have remaining nodes
// as 2.
