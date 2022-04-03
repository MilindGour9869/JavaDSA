import java.util.Arrays;
import java.util.ArrayList;

public   class Main {
    public static void main(String args[])
    {

        A a = new A(2);
        A b = new A(3);
        b=a;
        System.out.println(b);
        System.out.println(a);



       

    }

}

class A {
    int n;
    A(int n)
    {
        this.n=n;

    }

}
class B {
    int n;
    B(int n)
    {
        this.n=n;
        
    }

}
