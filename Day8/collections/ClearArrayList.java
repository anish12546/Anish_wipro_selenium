//Q7
package Assignment8_Collection;

import java.util.ArrayList;

public class ClearArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        System.out.println("Original list: " + numbers);

       
        numbers.clear();

        
        System.out.println("List after clear(): " + numbers);
        System.out.println("Size of list: " + numbers.size());
    }
}
