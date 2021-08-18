public class LinkedListSwap {
    Node head;
    public void swapNode(int x,int y)
    {
        if(x==y)
        {
            return;
        }
        //store prevX of x data
        Node prevX=null,currX=head;
        while (currX!=null&& currX.data!=x)
        {
            prevX=currX;
            currX=currX.next;
        }
        //store prevY of y data
        Node prevY=null,currY=head;
        while (currY!=null && currY.data!=y)
        {
            prevY=currY;
            currY=currY.next;
        }
        //if x and y not present in linkedlist
        if (currX==null||currY==null)
        {
            return;
        }
        //if x not head then store address of y in x
        if (prevX!=null)
        {
            prevX.next=currY;
        }
        else {
            //make y as head
            head=currY;
        }
        if (prevY!=null)
        {
            prevY.next=currX;
        }
        else {
            //make x as node
            head=currX;
        }
        //swap to node
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void printlist()
    {
        Node tnode=head;
        while (tnode!=null)
        {
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListSwap llist=new LinkedListSwap();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        //before swap
        llist.printlist();
        //after swap
        System.out.println();
        System.out.println("After swap ");
        llist.swapNode(6,4);
        llist.printlist();
    }
}

