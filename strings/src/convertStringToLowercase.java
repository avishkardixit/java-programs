import java.util.*;

public class convertStringToLowercase
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any string containing uppercase lowercase :");
       String str =sc.nextLine();
       String uc_str = str.toLowerCase();

       System.out.println("the lowecase string is :"+uc_str);
    }
}
