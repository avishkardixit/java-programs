import java.util.*;


public class print_star_pattern
{
    static void star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }


    }

        public static void main(String [] args)
        {

            Scanner sc = new Scanner(System.in);

            System.out.print("enter the number :");
            int n = sc.nextInt();

            star(n);


        }

}
