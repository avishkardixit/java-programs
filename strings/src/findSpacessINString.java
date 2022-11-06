import java.util.*;


public class findSpacessINString
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter string with spacess :");
        String str = sc.nextLine();

        int iOne = str.indexOf(" ");
        int iTwo =str.indexOf("  ");
        int iThree =str.indexOf("   ");

        System.out.printf("single space is on  %d number , Double space is on %d number  and trippel space is on  %d number",iOne+1,iTwo+1,iThree+1);
    }
}
