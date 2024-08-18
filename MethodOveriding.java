class Calc
{
    public int add(int a, int b)
    {
        return a+b;
    }
}

class AdvCalc extends Calc
{
  public int add(int a,int b)
    {
        return a+b+1;
    }
}



public class MethodOveriding
{
    public static void main(String[] args)
    {
    AdvCalc o=new AdvCalc();
    int r=o.add(5,4);
System.out.println(r);
    }
}