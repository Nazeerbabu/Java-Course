class A{
    A()
    {
        super();
        System.out.println("In A");
    }
    A(int n)
    {
        super();
        System.out.println("In Int A");
    }
}
class B extends A
{
    B()
    {
        super();
        System.out.println("In B");
    }
    B(int n)
    {
        this();
        System.out.println("In Int B");
    }

}

public class ThisSuper{
    public static void main(String[] args)
    {
        B o= new B(10);
    }
}