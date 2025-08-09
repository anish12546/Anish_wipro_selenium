//Q10
package Assignment8_LinkedList;

import java.util.LinkedList;

public class CloneLinkedList {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList of numbers
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);

        
       
        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        
        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}
