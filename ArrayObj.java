class Student{
    int rollno;
    String name;
}

public class ArrayObj{
    public static void main(String[] args){
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Nazeer";

        Student stud[]= new Student[1];
        stud[0]=s1;

        System.out.println("stud[0]:" + s1.name + ":" + s1.rollno); 
    }
}