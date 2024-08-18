import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Student<T>
{
    T obj;
    Student(T obj)
    {
        this.obj=obj;
    }

    public <T>  void display(){
        System.out.println("Type of object" + obj.getClass().getName());
    }
     T  getobj()
    {
        return obj;
    }
}



public class GenericClass {
    public static <T> void main(String[] args)
    {
       Student<T> s= new Student(5);
       System.out.println(s.getobj());

       s.display();
       Student<T> s1= new Student("Nazeer");
       System.out.println(s1.getobj());

       s1.display();
    }
}
