import java.util.HashSet;

public class CycleAndCountLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }
    static int countNode(Node n)
    {
        int res=1;
        Node temp=n;
        while (temp.next!=n)
        {
            res++;
            temp=temp.next;
        }
        return res;
    }
    static int countNodesInLoop(Node list)
    {
        Node slow=list,fast=list;
        while (slow!=null&&fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)
            {
                return countNode(slow);
            }
        }
        return 0;
    }
    static Node newNode(int key)
    {
        Node newNode=new Node(key);
        return newNode;
    }
    static boolean detectLoop(Node head)
    {
        HashSet<Node> st=new HashSet<>();
        Node h=head;
        while (h!=null)
        {
            if (st.contains(h))
            {
                return true;
            }
            st.add(h);
            h=h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=newNode(1);
        head.next=newNode(2);
        head.next.next=newNode(3);
        head.next.next.next=newNode(4);
        head.next.next.next.next=head.next;
        System.out.println(countNodesInLoop(head));
        System.out.println("loop is present "+detectLoop(head));
    }
}
