import java.util.*;

public class factorial_by_recursion {


    static int fact(int n)
    {
        if(n == 1 || n ==0)
        {
            return 1;
        }
        else
        {
            return n * fact( n-1);
        }

    }

    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n :");
         int n = sc.nextInt();

        int ft = fact(n);
        System.out.println("factorial is :"+ft);
    }
}
