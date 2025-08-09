package Assignment9;
//q10

import java.util.*;

public class StringLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Kiwi", "Strawberry");

        Collections.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        System.out.println("Sorted by length:");
        strings.forEach(System.out::println);
    }
}
