import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter N :");
        int n = sc.nextInt();

        int ft=0;

        for(int i = n ; i >= 0 ; i--)
        {
            ft = ft + i;
        }
        System.out.println(ft);

    }
}
