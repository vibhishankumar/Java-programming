import java.util.Stack;

public class PalindromeLinkedListNode {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }
    void push(int new_data)
    {
      Node new_node=new Node(new_data);
      new_node.next=head;
      head=new_node;
    }
    void printLinkedList()
    {
        Node tnode=head;
        while(tnode!=null)
        {
            System.out.print("data::"+ tnode.data+" ");
            tnode=tnode.next;
        }
    }
   boolean isPalindrom(Node head)
   {
       boolean isPalin=true;
       Node tnode=head;
       Stack<Integer> st=new Stack<>();
       while (tnode!=null)
       {
           st.push(tnode.data);
           tnode=tnode.next;
       }
       while (head!=null)
       {
           int i=st.pop();
           if (head.data==i)
           {
               isPalin=true;
           }
           else
               {
               isPalin= false;
               break;
           }
           head=head.next;
       }
       return isPalin;
   }
   Node reverse(Node head)
   {
       Node prev=null;
       Node curr=head;
       Node next=null;
       while (curr!=null)
       {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       head=prev;
       return head;
   }
   Node reverseInKgrp(Node head,int k)
   {
       Node prev=null;
       Node curr=head;
       Node next=null;
       int c=0;
       while (c<k&& curr!=null)
       {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
           c++;
       }
       if (next!=null)
       {
           head.next=reverseInKgrp(next,k);
       }
       return prev;
   }
    public static void main(String[] args) {
        PalindromeLinkedListNode list=new PalindromeLinkedListNode();
        list.push(3);
        list.push(2);
        list.push(8);
        list.push(1);
        list.printLinkedList();
        System.out.println(list.isPalindrom(list.head));
        //list.head=list.reverse(list.head);

        list.head=list.reverseInKgrp(list.head, 2);
        list.printLinkedList();
    }
}
