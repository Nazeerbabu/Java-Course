import java.util.*;

public class OptionalClassExample {
    public static void main(String[] args)
    {
        List<String> str1= Arrays.asList("Nazeer","Randheer","Bharath","Datagiri");

        String str2=str1.stream()

                        .filter(str->str.contains("r"))
                        .findFirst()
                        .orElse("Not Found");

    System.out.println(str2);

    }
}
