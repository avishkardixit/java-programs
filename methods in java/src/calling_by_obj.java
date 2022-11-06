//calling method by creating object
//we don't use static keyword in method initialization

public class calling_by_obj {

    int add(int a , int b , int c , int d)
    {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        calling_by_obj obj1 = new calling_by_obj();
       int  c =obj1.add(1,34,55,3);

        System.out.println(c);

    }
}
