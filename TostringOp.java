import java.util.*;
import java.io.*;
public class TostringOp{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string one");
        String str1=sc.nextLine();
        System.out.println("enter string second");
        String str2=sc.nextLine();
        if(str1==str2)//comapare only address of string not values
        {
           System.out.println("string are not equal"); 
        }
        else if(str1.equals(str2))  // checking value of string
        {
            System.out.println("enter string is equal");
            //length of string 
            System.out.println(str1.length());
            //concat string
            System.out.println(str1.concat(str2));
            //into upper case
            System.out.println(str1.toUpperCase());
            //into lower Case
            System.out.println(str1.toLowerCase());


            
        }

    }
}