class Calc
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }

}

class AdvCalc extends Calc
{
    public int multi(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }

}

class SciCalc extends AdvCalc{
    public double power(int a,int b)
    {
        return Math.pow(a,b);
    }
}

public class MultiLevelInherit
{
    public static void main(String[] args)
    {
   SciCalc o=new SciCalc();
   int r1=o.add(10,5);
   int r2=o.sub(10,5);
   int r3=o.multi(10,5);
   int r4=o.div(10,5);
   double r5=o.power(10,5);

   System.out.println(r1 +" "+ r2 +" "+ r3 +" "+ r4+" "+r5);
}
}