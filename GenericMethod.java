
class Demo<T>{

        public static <E>void display(E[] a)
{
    for(E n:a)
    {
        System.out.println(n);
    }

}
}
public class GenericMethod {
    public static void main(String[] args)
    {
        Integer [] a={1,2,3,4};
        Demo d= new Demo();
        d.display(a);
        

}

    
}
