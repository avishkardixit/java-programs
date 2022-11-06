import java.util.Scanner;

public class SumOfThreeInt
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- ENTER THREE NUMBERS -----");

        System.out.print("a :");
        int a = sc.nextInt();

        System.out.print("b :");
        int b = sc.nextInt();

        System.out.print("c :");
        int c = sc.nextInt();

        int sum=a+b+c;
        System.out.println("sum :"+sum);
    }
}
