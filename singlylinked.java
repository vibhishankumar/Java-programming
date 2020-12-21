public class singlylinked {
    //head
    Link head;
    //static inner class
    //A static inner class is a nested class which is a static member of the outer class.
    // It can be accessed without instantiating the outer class, using other static members.
    static class Link{
        //data field
        int data;
        Link next;
        //constructor
        Link(int d)
        {
            data=d;
            next=null;
        }
    }
    //static insert method so that used in main method
    //since static method can be used inside static method withod instantiation,that only with name
    public static singlylinked insert(singlylinked list,int data)
    {
        Link new_link=new Link(data);
        if (list.head==null)
        {
            list.head=new_link;
        }
        else {
            Link temp=list.head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_link;
        }
     return list;
    }
    //printing linked list data values
    public static void printlist(singlylinked list)
    {
        Link currNode= list.head;
        while(currNode!=null)
        {
            System.out.println(currNode.data+ " ");
            currNode=currNode.next;
        }
    }
    //delete method for deleting data value passed by user
    public static void deletnode(singlylinked lst,int key)
    {
        Link temp= lst.head,prev=null;
        //if head self is to be deleted
        if (temp!=null&& temp.data==key)
        {
            lst.head=temp.next;
            return;
        }
        while (temp!=null&&temp.data!=key)
        {
            prev=temp;
            temp=temp.next;
        }
        //if key was not present in linked list
        if (temp==null)
        {
            System.out.println("key not found "+ key);
            return;
        }
        //unlinking the node from linked list
        prev.next=temp.next;


    }
  //main method
    public static void main(String[] args) {
        //creating object and inserting the data values into linked list
        singlylinked l=new singlylinked();
        l=insert(l,12);
        l=insert(l,47);
        l=insert(l,89);
        System.out.println("linked list elements are :");
        //for printing data of linked list
        printlist(l);
        //for deleting node value
        deletnode(l,12);
        System.out.println("after deleting element");
        printlist(l);
    }
}
