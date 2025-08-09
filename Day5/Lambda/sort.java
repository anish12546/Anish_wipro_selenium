package assignment_5;
import java.util.*;

public class sort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "mango");

        // Sort by length
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by length: " + list);

        // Sort alphabetically
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted alphabetically: " + list);

        // Sort by length, then alphabetically
        list.sort((s1, s2) -> {
            int lenCompare = Integer.compare(s1.length(), s2.length());
            return (lenCompare != 0) ? lenCompare : s1.compareTo(s2);
        });
        System.out.println("Sorted by length, then alphabetically: " + list);
    }
}

