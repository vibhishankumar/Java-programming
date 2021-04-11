import java.util.*;
import java.util.LinkedList;

public class JavaLinkList {
    public static void main(String[] args)
    {
        LinkedList<Integer> singly=new LinkedList<>();
        singly.add(20);
        singly.add(30);
        singly.add(12);
        singly.forEach(i-> System.out.print(i +" "));
        System.out.println();
        singly.sort(Integer::compareTo);
        singly.forEach(i-> System.out.print(i +" "));
       // System.out.println(singly.size());
        //singly.forEach(i-> System.out.println());
        System.out.println("print");
        for (int i=0;i<singly.size();i++)
        {
            System.out.print(singly.get(singly.size()-1-i) +" ");
        }
    }


}
