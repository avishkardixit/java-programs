public class Sum_two_matrixes_of2x3
{
    public static void main(String args[])
    {
        int [][]mtr1 = new int[2][3];
        mtr1[0][0]=1;
        mtr1[0][1]=12;
        mtr1[0][2]=14;

        mtr1[1][0]=51;
        mtr1[1][1]=61;
        mtr1[1][2]=21;

        int [][]mtr2 = new int[2][3];
        mtr2[0][0]=17;
        mtr2[0][1]=2;
        mtr2[0][2]=14;

        mtr2[1][0]=5;
        mtr2[1][1]=6;
        mtr2[1][2]=210;

        int [][]mtr_r =new int[2][3] ;
        mtr_r[0][0]=0;
        mtr_r[0][1]=0;
        mtr_r[0][2]=0;

        mtr_r[1][0]=0;
        mtr_r[1][1]=0;
        mtr_r[1][2]=0;


        //adding matrices
        for(int i = 0 ; i < 2 ; i++)
        {
            for(int j = 0 ; j < 3 ;j++)
            {
               mtr_r[i][j]=mtr1[i][j]+mtr2[i][j];
            }
        }

        //display addition

        for(int i = 0 ; i < 2 ; i++)
        {
            for(int j = 0 ; j < 3 ;j++)
            {
                System.out.println(mtr_r[i][j]);

            }
        }



    }
}
