import java.util.Scanner;


public class HelloAdmin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name :");
        String name =sc.nextLine();

        System.out.println("Welcome Mr."+name+" these is your pc ");
    }
}
