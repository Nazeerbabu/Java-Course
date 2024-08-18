class A{
    public void display()
    {
        System.out.println("In A");
    }
}
class B extends A 
{
    public void display()
    {
        System.out.println("In B");
    }
}

class C extends B
{
    public void display()
    {
        System.out.println("In C");
    }
}





public class RuntimePoly{
    public static void main(String[] args)
    {
       A o=new C();
       o.display();
       o=new B();
       o.display();
       o=new A();
       o.display();
    }
}