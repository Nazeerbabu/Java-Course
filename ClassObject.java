public class ClassObject{
    public static void main(String[] args)
    {
        Calc n1=new Calc();

        int p=n1.add(5,4);
        System.out.println(p);

    }
}

class Calc{

    public int add(int a,int b)
    {
        int r=a+b;
        return r;
}
    }

