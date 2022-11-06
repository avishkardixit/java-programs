import java.util.Scanner;

public class InputString
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);  //we created s object of a new scanner class

        System.out.print("Name :");
        String name = s.next();



        System.out.println("your name is : "+name);
    }


}
