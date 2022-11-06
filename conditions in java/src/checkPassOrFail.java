import java.util.*;



public class checkPassOrFail
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks Of enlish math scinece :");
        int eng =sc.nextInt();
        int math = sc.nextInt();
        int sci =sc.nextInt();

        int prct =(eng+math+sci)/3;

        System.out.println("Percentage :"+prct);

        if(prct <= 34)
        {
            System.out.println("You are failled");
        }
        else if(prct >=35 && prct <= 50)
        {
            System.out.println("Yoy are passed");
        }
        else if(prct >=51 && prct <= 70)
        {
            System.out.println("Yoy are passed , with first class");
        }
        else if(prct >=71 && prct <= 100)
        {
            System.out.println("Yoy are passed , with Full ditinction.");
        }
        else
        {
            System.out.println("something went wrong >>>");

        }

    }
}
