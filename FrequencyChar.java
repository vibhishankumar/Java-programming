import java.util.*;
public class FrequencyChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string :");
        String str=sc.nextLine();
        int freq[]=new int[26];
        int n=str.length();
        for (int i=0;i<n;i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        for (int i=0;i<n;i++)
        {
          if (freq[str.charAt(i)-'a']!=0)
          {
              System.out.print(str.charAt(i));
              System.out.print(freq[str.charAt(i)-'a']);
              //make charackter freq zero so that not printed same character
              freq[str.charAt(i)-'a']=0;
          }
        }
    }
}
