//Q4
package Assignment8_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        numbers.add(22);
        numbers.add(17);
        numbers.add(10);
        numbers.add(8);
        numbers.add(65);
        numbers.add(33);
        numbers.add(21);

        
        Collections.sort(numbers);

       
        System.out.println("Sorted list (ascending): " + numbers);
    }
}
