public class SinglyList {
    node head;//head of singlyList
    static class node
    {
        int data;
        node next;
        //constructor
        node(){

        }
        node(int d)
        {
            data=d;
            next=null;
        }
    }
    //method to insert data
    public static SinglyList insert(SinglyList list,int data)
    {
        node newNode =new node(data);
        newNode.next=null;
        if(list.head==null)
        {
            list.head=newNode;
        }
        else
        {
            node lastNode= list.head;
            while (lastNode.next!=null)
            {
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
        return list;
    }
    public static SinglyList reverese(SinglyList list)
    {
        node prev=null;
        node curr=list.head;
        node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        list.head=prev;
        return list;
    }
    //print linklist
    public static void displayList(SinglyList list)
    {
        node curr_node=list.head;
        System.out.println("singlyList  ");
        while (curr_node!=null)
        {
            System.out.print(curr_node.data +" ");
            curr_node=curr_node.next;
        }
    }
    public static void main(String[] args)
    {
        SinglyList list=new SinglyList();


        list=insert(list,23);
        //list=insert(list,76);
        insert(list,55);
       // list=insert(list,12);
        displayList(list);
        System.out.println();
        reverese( list);
        displayList(list);
    }
}
