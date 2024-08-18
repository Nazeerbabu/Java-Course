class A{
    int age;
    A()
    {
        age=12;
    }
    public void display()
    {
        System.out.println(age);
    }
     class B{
        public void display(){
            System.out.println("In B Show");
        }
    }
}
public class InnerExample{
    public static void main(String[] args)
    {
        A o =new A();
        o.display();
        A.B o1 =  o.new B();
        o1.display();
    }
}