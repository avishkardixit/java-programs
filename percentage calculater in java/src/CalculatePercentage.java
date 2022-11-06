import java.util.Scanner;


public class CalculatePercentage {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- ENTER YOUR MARKS SUBJECT VISE -----");

        System.out.print("math :");
        int math = sc.nextInt();

        System.out.print("english :");
        int english = sc.nextInt();

        System.out.print("scinece :");
        int science = sc.nextInt();

        System.out.print("marathi :");
        int marathi = sc.nextInt();

        System.out.print("hindi:");
        int hindi = sc.nextInt();

        System.out.print("social Scinece :");
        int social = sc.nextInt();

        int total = math+english+science+marathi+social+hindi;
        float percentage = total/6;

        System.out.println("The total of marks is "+total+"and precentage is "+percentage);


    }
}
