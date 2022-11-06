public class find_element_is_present_in_array_or_not
{
    public static void main(String args[])
    {
        int []arr ={ 2,3,55,77,89,7,56,45,67,54,34,67,897,65,24,6};
        int find = 7;
        for(int i = 0 ; i<arr.length ;i++)
        {
            if(arr[i]==find)
            {
                System.out.println("element found..!! at "+arr[i]+" th position");
                break;
            }

        }
    }
}
