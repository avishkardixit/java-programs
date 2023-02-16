interface lam
{
    public void meth1();
}

interface  perimetrised
{
    public void pmeth(int a);
}

public class lambdaExpression {


    public static void main(String[] args) {
        //lambda expression
        lam l1 = ()->{        System.out.println("these is method 1");      };

        l1.meth1();

        //paremetrised lambda expression
        perimetrised p1 = (a)->{      System.out.println(a*a);         };
        p1.pmeth(4);
    }
}
