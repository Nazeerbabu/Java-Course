class Mobile{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand + ":" + price + ":" + name);
    }
    public static void show1(Mobile o)
    {
       System.out.println(o.brand + ":" + o.price + ":" + name);  
    }
}
public class StaticMethodExample{
    public static void main(String[] args)
    {
        Mobile o=new Mobile();
        o.brand="Apple";
        o.price=1500;
        Mobile.name="IOS";
        o.show();
        Mobile.show1(o);
    }
}