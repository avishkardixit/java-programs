import java.util.*;


public class get_element_by_llops
{
    public static void main(String args[])
    {
        int [][]arr;
        arr=new int[3][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter val :");
        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0 ; j < 2 ;j++)
            {
                arr [i][j]=sc.nextInt();
            }
        }

        //entered values are
        System.out.println("values are");
        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0 ; j < 2 ;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
        }


    }
}
