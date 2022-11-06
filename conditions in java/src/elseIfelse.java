import java.util.Scanner;

public class elseIfelse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is yor age :");
        int age = sc.nextInt();
        if(age>=18 && age<=109)
        {
            System.out.println("you can vote ");

        }
        else if(age>=110)
        {
            System.out.println("Please enter valid age ");
        }
        else
        {
            System.out.println("You r not eligible to vote");
        }

    }
}
