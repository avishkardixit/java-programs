interface inter1
{
    public  void meth1();

    public  void meth2();

}

public class anonymousClassFirst {


    public static void main(String[] args) {

        inter1 i1 = new inter1(){
                                   @Override
                                   public void meth1() {
                                       System.out.println("method 1");

                                   }

                                   @Override
                                   public void meth2() {
                                       System.out.println("method 2");

                                   }
                                };

        i1.meth1();
        i1.meth2();

    }
}
