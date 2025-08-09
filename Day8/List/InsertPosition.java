//Q3
package Assignment8_LinkedList;

import java.util.LinkedList;

public class InsertPosition {
    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        
        System.out.println("Before insertion: " + names);

        
        names.add(2, "Eve");  // Inserts "Eve" at index 2

       
        System.out.println("After insertion at index 2: " + names);
    }
}

