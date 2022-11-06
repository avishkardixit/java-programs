public class sum_of_Num_in_8_table
{
    public static void main(String[] args) {
        int n = 8;
        int sum =0;
        for(int i = 1 ; i <=10 ;i++ )
        {
            System.out.println(i*n);
            sum = sum +(i*n);
        }
        System.out.println(sum);
    }
}
