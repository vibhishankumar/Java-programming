class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int count[]={0,0,0};
        Node temp=head;
        while(temp!=null)
        {
            count[temp.data]++;
            temp=temp.next;
        }
        int i=0;
        temp=head;
        while(temp!=null)
        {
            if(count[i]==0)
            i++;
            else
            {
              temp.data=i;
              --count[i];
              temp=temp.next;
            }
        }
        return head;
    }
}
// Input:
// N = 4
// value[] = {2,2,0,1}
// Output: 0 1 2 2
