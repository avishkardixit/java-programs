import java.util.Scanner;


public class InputeAndAdd
{
    public static void main(String[] args)
    {
        System.out.println("<<adding two numbers by taking inpute from user >>>");

        Scanner s = new Scanner(System.in);  //we created s object of a new scanner class

        System.out.print("First number :");
        int a =s.nextInt();

        System.out.print("Second number :");
        int b =s.nextInt();

        int add = a+b;

        System.out.println("Addition of Two numbers is :"+add);
    }
}
