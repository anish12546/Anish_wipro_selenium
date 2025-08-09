//Q2
package Assignment8_LinkedList;

import java.util.LinkedList;

public class AddFirstLastLinkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> numbers = new LinkedList<>();

        
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original list: " + numbers);

        
        numbers.addFirst(10);  // Adds 10 at the start
        numbers.addLast(50);   // Adds 50 at the end

        
        System.out.println("Updated list after adding first and last: " + numbers);
    }
}

