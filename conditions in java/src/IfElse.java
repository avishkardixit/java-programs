import java.util.*;


public class IfElse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is yor age :");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("you can vote ");

        }
        else
        {
            System.out.println("you are not elligible to vote");
        }

    }
}
