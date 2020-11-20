import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
public class Bufferreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter string");
        String name= br.readLine();
        System.out.println("enter integer");
        int n= Integer.parseInt(br.readLine());
        System.out.println("enter integer");
        int m=Integer.parseInt(br.readLine());
        System.out.println("string is :" +name);
        System.out.println("interger with read only :"+n);
        System.out.println("enter integer from parseInt :" +m);
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        System.out.println("enter value of p");
        int p=Integer.parseInt(br.readLine());
        int c=0;
        for(int i=0;i<n;i=i+p)
        {
            int sum=0;
            for (int j=i;j<p+i;j++)
            {
                sum+=arr[j];
            }
            System.out.println("sum :"+sum);
            if (sum==m)
            {
                c++;
            }
        }
        int sum1=0;
        for (int j=0;j<p;j++)
        {
            sum1+=arr[j];
        }
        System.out.println("Sum1 is: " +sum1);
        //System.out.println(sum);
        System.out.println("number of star :" +c);
    }
}
