/*Scissors beats papers ,paper beats Rock and Rock beats Scissors */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int rend= rand.nextInt(3);
        System.out.println("Enter 0 for Paper :");
        System.out.println("Enter 1 for Rock :");
        System.out.println("Enter 2 for Scissor :");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        if (ch==0&& rend!=0)
        {
            System.out.println("choice enter by user :" +ch);
            System.out.println("Random number generated by system :" +rend);
            System.out.println("You have won the match");
        }
        else if (ch==1 && rend==0)
        {
            System.out.println("choice enter by user :" +ch);
            System.out.println("Random number generated by system :" +rend);
            System.out.println("You loss the match");
        }
        else if (ch==1 && rend==2)
        {
            System.out.println("choice enter by user :" +ch);
            System.out.println("Random number generated by system :" +rend);
            System.out.println("You have won the match");
        }
        else if(ch==2&&rend==1)
        {
            System.out.println("choice enter by user :" +ch);
            System.out.println("Random number generated by system :" +rend);
            System.out.println("You  loss the match");
        }
        else if(ch==2&&rend==0)
        {
            System.out.println("choice enter by user :" +ch);
            System.out.println("Random number generated by system :" +rend);
            System.out.println("You have won the match");
        }
        else
        {
            System.out.println("choice enter by user :" +ch);
            System.out.println("Random number generated by system :" +rend);
            System.out.println("match  tie ");
        }

    }
}
