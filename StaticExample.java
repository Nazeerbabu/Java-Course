class Mobile{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand + ":" + price + ":" + name);
    }
}
public class StaticExample{
    public static void main(String[] args)
    {
        Mobile o=new Mobile();
        o.brand="Apple";
        o.price=1500;
        Mobile.name="IOS";
        o.show();
    }
}