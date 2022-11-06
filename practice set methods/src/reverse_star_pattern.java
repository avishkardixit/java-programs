import java.util.Scanner;

public class reverse_star_pattern
{



        static void star_re(int n) {
            for (int i = n; i > 0; i--) {
                for (int j = 0; j < i; j++) {
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

            star_re(n);


        }


}
