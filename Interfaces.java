
 interface A{

    public void display();
    public void show();

}
 interface B{

public void fly();
}

class C implements A,B{

    public void fly() {
        System.out.println("In Fly");
    }

    public void display() {
        System.out.println("In Display");
    }

    
    public void show() {
        System.out.println("In Show");
    }
    
}
public class Interfaces{
    public static void main(String[] args)
    {
        C obj= new C();
        obj.show();
        obj.display();
        obj.fly();
    }
}
