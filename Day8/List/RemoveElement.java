//Q4
package Assignment8_LinkedList;

import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList of animal names
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        System.out.println("Original list: " + animals);

        
        animals.removeFirst();
        System.out.println("After removing first element: " + animals);

       
        animals.removeLast();
        System.out.println("After removing last element: " + animals);
                                                                                                                  
       
        boolean removed = animals.remove("Elephant");
        if (removed) {
            System.out.println("After removing 'Elephant': " + animals);
        } else {
            System.out.println("'Elephant' not found in the list.");
        }
    }
}

