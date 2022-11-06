imcomplete#######


class library
{
    String  [] arr_books = {"book1","book2","book3","book4","book5"};
    String [] unavailable;
    int i = 0;
    public String get_book(int index)
    {
        arr_books[index]=unavailable[i];
        i=i+1;
        return arr_books[index];


    }
    public String find_unavaibale(int ind)
    {
        return unavailable[ind];
    }
}






public class myclass {

    public static void main(String[] args)
    {
        library l1 = new library();
        System.out.println(l1.get_book(2));
        System.out.println(l1.find_unavaibale(0));

    }
}
