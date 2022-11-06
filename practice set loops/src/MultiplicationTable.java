import java.util.*;

public class MultiplicationTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("digit :");
        int d =sc.nextInt();

        for(int i = 1 ; i<=10;i++)
        {
            System.out.printf("%d X %d =  %d \n",d,i,i*d);

        }
    }
}
