//Q6
package Assignment8_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
       
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        
        ListIterator<String> listIterator = cities.listIterator();

        
        System.out.println("Cities in forward direction:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Backward iteration
        System.out.println("\nCities in reverse direction:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
