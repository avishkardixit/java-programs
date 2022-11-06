import java.util.Scanner;

public class inpute_from_java
{
    public static void main(String[] args) {
        System.out.println("let's take inpute from user >>>");
        Scanner a = new Scanner(System.in);
        System.out.print("enter the number :");
        int b = a.nextInt();
        System.out.println("number is :"+b);
    }
}
