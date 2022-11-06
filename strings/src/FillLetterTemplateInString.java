import java.util.*;

public class FillLetterTemplateInString
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        String str = "hello <name> , welcome to code  ";

        System.out.print("NAME :");
        String name = sc.nextLine();

        String rpls = str.replace("<name>",name);//we replaced <name> with our users input

        System.out.println(rpls);

    }
}
