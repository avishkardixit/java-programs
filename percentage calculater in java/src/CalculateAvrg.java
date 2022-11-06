import java.io.*;


public class CalculateAvrg
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("number 1st :");
        int i = Integer.parseInt(br.readLine());

        System.out.print("number 2nd :");
        int j = Integer.parseInt(br.readLine());

        System.out.print("number 3rd :");
        int k = Integer.parseInt(br.readLine());

        int sum=i+j+k;
        int avrgg = sum/3;


        System.out.println("Sum of three numbers is "+sum+" and there average is "+avrgg);
    }
}
