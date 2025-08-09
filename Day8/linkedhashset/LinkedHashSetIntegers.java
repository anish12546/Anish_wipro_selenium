//Q1
package Assignment8_LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetIntegers {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5);  // Duplicate

        System.out.println("LinkedHashSet elements (insertion order):");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
