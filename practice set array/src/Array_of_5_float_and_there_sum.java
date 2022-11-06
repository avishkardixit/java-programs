public class Array_of_5_float_and_there_sum
{
    public static void main(String args[])
    {
        float []arr = {1.2f,34.5f,67.5f,87.9f,44.5f};
        float sum =0;
        for(int i = 0 ; i < 5 ; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);



    }
}
