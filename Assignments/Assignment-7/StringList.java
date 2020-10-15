import java.util.*;
import java.util.stream.Collectors;

public class StringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Abhishek", "2K", "AKK", "", "A Keshri", "Keshri", "Kumar", "");
        System.out.println(strings);
        int c1 = 0, c2 = 0;

        c1 = (int) strings.stream().filter(s -> s.length() > 5).count();
        c2 = (int) strings.stream().filter(s -> s.length() == 0).count();

        System.out.println("No of strings with length more than 5 is: " + c1);
        System.out.println("No of empty strings is: " + c2);

        List<String> filtered = strings.stream().filter(s -> s.length() > 0).collect(Collectors.toList());
        System.out.println("After deleting empty strings: " + filtered);
    }
}
