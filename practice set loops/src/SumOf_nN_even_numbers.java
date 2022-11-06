import java.util.*;

public class SumOf_nN_even_numbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter N :");
        int n = sc.nextInt();

        int sum=0;

        for(int i = 1 ; i <= n ; i++)
        {
           sum = sum + i;
        }
        System.out.println(sum);

    }
}
