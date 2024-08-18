import java.util.*;


public class LinkedSetExample {
    
     public static void main(String[] args)

    {
        Set <Integer> nums= new LinkedHashSet<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);


       Iterator <Integer> values= nums.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }


        
    }
}
