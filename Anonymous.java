class A{
    public void display()
    {
        System.out.println("In A show");
    }
}
public class Anonymous{
    public static void main(String[] args)
    {
        A o=new A(){
            public void display()
    {
        System.out.println("In new show");
    }
        };
        o.display();
    }
}