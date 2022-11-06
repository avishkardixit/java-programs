//what is fibonnaci sereis ?
// it is a series of numbers where each number is sum of its preseding two numbers
//example 0,1,1,2,3,5,8,13  here every number is sum of its preseding two numbers



import java.util.*;

public class N_th_element_of_fibonacci_series {

     static int fibbo(int n)
     {
         if(n == 1)
         {
             return 0;
         }
         else if (n == 2)
         {
             return 1;
         }
         else
         {
             return fibbo(n-1)+fibbo(n-2);
         }

     }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nth number :");
        int num = sc.nextInt();

        int fibi = fibbo(num);

        System.out.println(num+"th number in series is "+fibi);

    }
}
