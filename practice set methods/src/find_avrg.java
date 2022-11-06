
//here every argumnet is converted into array so that
// any number of argument can be calculated by our method
//

public class find_avrg
{
    static int avrg(int ...avg_arr)
    {
        int sum = 0;

        for(int i = 0 ; i < avg_arr.length ; i++)
        {
            sum = sum +avg_arr[i];
        }
        int avg = sum/avg_arr.length;
        return avg;
    }
    public static void main(String args[])
    {
        int avrg1 = avrg(23,45,56,78,55,23,567,887);
        int avrg2 =avrg(34,56,77);

        System.out.println("1st avrg "+avrg1);
        System.out.println("2nd avrg "+avrg2);
    }
}
