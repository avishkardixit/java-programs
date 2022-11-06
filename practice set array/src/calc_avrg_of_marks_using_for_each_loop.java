public class calc_avrg_of_marks_using_for_each_loop
{
    public static void main(String args[])
    {
        int []PhyMarks ={45,66,77,54,66,45,67,54};
        int sum=0;



        for(int i = 0; i < PhyMarks.length ; i++)
        {
            sum = sum+PhyMarks[i];
        }
        int avg = sum/8;
        System.out.println("average of marks is "+avg);

    }
}
