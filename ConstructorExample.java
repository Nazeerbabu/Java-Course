class Human{
    int age;
    String name;

    Human()
    {
        age=25;
        name="Nazeer";
    }
    Human(int age ,String name)
    {
        this.age=age;
        this.name=name;
    }
    public void Display()
    {
        System.out.println(name +": "+ "Age:" + age);
    }
}
public  class ConstructorExample{
public static void main(String args[])
{
    Human o=new Human();
    o.Display();
    Human o1=new Human(26,"Nazeer");
    o1.Display();

}
}