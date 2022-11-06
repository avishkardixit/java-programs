import java.util.*;


public class ReplaceSpacesWithUnderscore
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string containing spaces :");
        String strr = sc.nextLine();

        String und = strr.replace(' ','_');

        System.out.println("String with underscore is :"+und);
    }
}
