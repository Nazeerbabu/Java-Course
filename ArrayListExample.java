import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args)

    {
        List <Integer> nums= new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        for(Integer n: nums)
        {
            int num = (Integer)n;
            System.out.println(num*2);
        }
        
    }
}
