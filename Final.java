final class Calc
{
    final public void display()
    {
        System.out.print("Nazeer: ");
    }
}


public class Final
{
    public static void main(String[] args)
    {
       final int age=26;
    Calc o=new Calc();
    o.display();
System.out.println(age);
    }
}