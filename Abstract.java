abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void display()
    {
        System.out.println("Playing");
    }
}
abstract class X extends Car{
    public void drive()
    {
        System.out.println("Driving");
    }

}
class Y extends X
{
 public void fly()
 {
    System.out.println("Flying");
 }   
}
class Abstract{
    public static void main(String[] args)
    {
        X o=new Y();
        o.drive();
        o.display();
        o.fly();
    }
}