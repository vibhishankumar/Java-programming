import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class GenericAndColl {
    public static void main(String[] args) {
        /*List<Integer> arr=new ArrayList<>();
        arr.add(45);
        arr.add(34);
        arr.add(67);
        arr.add(2);
        for (int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) +" ");
        }
        System.out.println("\n");
        Collections.sort(arr);
        for (int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) +" ");
        }*/
       int n;
        System.out.println("enter size of array :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        Vector<Integer> v=new Vector<Integer>();

        for (int i=0;i<n;i++)
        {
            if (arr[i]%2==0)
            {
                v.add(arr[i]);
            }
        }
        //sorting vector element
        Collections.sort(v);
        //printing vector element
        System.out.println("Sorted elements stored in vector :");
        for (int i=0;i<v.size();i++)
        {
            System.out.print(v.get(i)+" ");
        }
        System.out.println("\n");
        //Set implementation
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            s.add(arr[i]);
        }
        //printing of set elements
        System.out.println("set elements are :");
        Iterator<Integer> itr=s.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        //sortedSet Implemenation
        SortedSet<Integer> sr=new TreeSet<Integer>();
        for (int i=0;i<n;i++)
        {
            sr.add(arr[i]);
        }
        System.out.println(" ");
        Iterator<Integer> it= sr.iterator();
        System.out.println("Sorted Set Elements are :");
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }


    }
}
