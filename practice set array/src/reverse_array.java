public class reverse_array
{
    public static void main(String args[])
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9};
        int l = arr.length;
        int mid = l/2;

        for(int i = 0;  i < mid ; i++)
        {
            int temp = arr[i];
            arr[i] =arr[l-i-1];
            arr[l-i-1]=temp;

        }

        //swaping



        //print the array
        for(int i = 0 ; i < arr.length ;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
