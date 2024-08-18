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



public class SingleInherit
{
    public static void main(String[] args)
    {
   AdvCalc o=new AdvCalc();
   int r1=o.add(10,5);
   int r2=o.sub(10,5);
   int r3=o.multi(10,5);
   int r4=o.div(10,5);

   System.out.println(r1 +" "+ r2 +" "+ r3 +" "+ r4);
}
}