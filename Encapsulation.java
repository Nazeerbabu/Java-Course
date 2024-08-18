class Human{
    private int age;
    private String name;

    public void setAge(int a)
    {
      age=a;
    }
    public void getAge()
    {
        System.out.println(age);
    }
    public void setName(String b)
    {
      name=b;
    }
    public void getName()
    {
        System.out.println(name);
    }
}

public class Encapsulation{
    public static void main(String[] args)
    {
        Human h=new Human();
        h.setAge(26);
        h.getAge();
        h.setName("Nazeer");
        h.getName();
    }
}