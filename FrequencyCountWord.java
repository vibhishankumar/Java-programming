import java.util.*;
public class FrequencyCountWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter string :");
        str=sc.nextLine();
       // System.out.println(str);
        Map<String,Integer> m=new TreeMap<>();
        String arr[]=str.split(" ");
        for(int i=0;i< arr.length;i++)
        {
            if (m.containsKey(arr[i]))
            {
                m.put(arr[i],m.get(arr[i])+1);
            }
            else
            {
                m.put(arr[i],1);
            }
        }
        for(Map.Entry<String,Integer> itr: m.entrySet())
        {
            System.out.println(itr.getKey()+ "  "+itr.getValue());
        }
    }
}
