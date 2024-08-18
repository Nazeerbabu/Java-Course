import java.util.*;
 class Human{
    void display()
    {
        System.out.println("In Parent Class ");
    }
}

class Employee extends Human{
    void display()
    {
       System.out.println("In Child Class");
    }
}




public class UpperBound {
    public static void main(String[] args)
    {
      Human h1= new Human();
      Human h2= new Human();
      Employee e1= new Employee();
      Employee e2= new Employee();

      List<Human> h3= new ArrayList<>();
      h3.add(h1);
      h3.add(h2);
      List<Employee> e3= new ArrayList<>();
      e3.add(e1);
      e3.add(e2);
      sleep(e3);


    }
    public static void sleep(List<? extends Human> list)
{
    for(Human n: list)
    {
      n.display();
    }
}
}
