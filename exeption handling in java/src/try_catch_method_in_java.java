
//using try catch to handel arithmetic exception

import java.util.*;

public class try_catch_method_in_java
{
    public static void main(String args[])
    {
        int num = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.print("divide "+num+"by:");
        int div = sc.nextInt();


        //here when we divide by zero then we will get arithmetic exception hence we used
        //TRY CATCH BLOCK
        try {
            System.out.println("division :"+num/div);
        }
        catch (Exception e)
        {
            System.out.println("division is not possible because of the reason :");
            System.out.println(e);
        }



    }

}
