class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In Static Block");
    }

    Mobile() {
        brand = "Apple";
        price = 1500;
        System.out.println("In Constructor");
    }
}

public class StaticBlockExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
    }
}
