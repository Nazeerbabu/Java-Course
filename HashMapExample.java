import java.util.*;


public class HashMapExample {
    
     public static void main(String[] args)

    {
        Map <String,Integer> nums= new HashMap<String,Integer>();
        nums.put("First",6);
        nums.put("Second",7);
        nums.put("Third",8);
        nums.put("Four",9);


       System.out.println(nums.entrySet());
       
       System.out.println(nums.keySet());

       for(String key:nums.keySet())
       {
        System.out.println(nums.get(key));
       }



        
    }
}
