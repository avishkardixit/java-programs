import java.util.*;
import java.lang.Math;

public class RockPaperScessor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        int max = 3;
        int min = 1;
        double rnd =  Math.random()*(max-min+1)+min;
        int rndi = (int)rnd;
        System.out.println(rndi);

        // 1 = rock
        // 2 = paper
        // 3 = sessior

        System.out.println("enter your choice :\n1) rock  \n2) paper \n3)sessior :");
        int you = sc.nextInt();

        System.out.println("computer choice is :"+rndi);

        if((rndi == 1 && you == 1)||(rndi == 2 && you == 2)||(rndi == 3 && you == 3))
        {
            System.out.println("tie");
        }
        else if((rndi == 1 && you == 2)||(rndi == 2 && you == 3)||(rndi == 3 && you == 1))
        {
            System.out.println("You are Winner .....!!!");
        }
        else
        {
            System.out.println("You are losser .....!!!");

        }


    }
}
