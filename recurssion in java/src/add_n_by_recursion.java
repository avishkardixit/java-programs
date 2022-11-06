import java.util.*;


public class add_n_by_recursion {

    static int sum(int n)
    {
        if(n == 1 || n ==0)
        {
            return 1;
        }
        else
        {
            return n + sum( n-1);
        }

    }

    public static void main(String args[])
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n :");
      //  int n = sc.nextInt();

        int sum = sum(4);
        System.out.println(sum);
    }
}
