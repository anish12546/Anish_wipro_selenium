//Q7
package Assignment8_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(45);
        numbers.add(10);
        numbers.add(78);
        numbers.add(32);
        numbers.add(5);

        System.out.println("Before sorting: " + numbers);

        
        Collections.sort(numbers);

        System.out.println("After sorting: " + numbers);
    }
}
