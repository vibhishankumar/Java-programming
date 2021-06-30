import java.util.*;
public class FindFirstOccurence {
    static void FirstOccur(int arr[])
    {
        int min=-1;
        HashSet<Integer> out=new HashSet<>();
        for (int i= arr.length-1;i>=0;i--)
        {
            if (out.contains(arr[i]))
            {
                min=i;
            }
            else
            {
                out.add(arr[i]);
            }
        }
        if (min!=-1)
        {
            System.out.println("first occurenace Number is ::"+arr[min]);
        }
        else
        {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array element");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        FirstOccur(arr);
    }
}
