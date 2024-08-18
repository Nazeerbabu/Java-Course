public class MethodOverload{
    public static void main(String[] args)
    {
        Calc n1=new Calc();

        int p=n1.add(5,4);
        int q=n1.add(5,4,6);
        double r=n1.add(5,4.50);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

    }
}

class Calc{

    public int add(int a,int b)
    {
        int r=a+b;
        return r;
}
public int add(int a,int b,int c)
    {
        int r=a+b+c;
        return r;
}
public double add(int a,double b)
    {
        double r=a+b;
        return r;
}
    }