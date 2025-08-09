
//Q1
package Assignment8_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class CityHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Kolkata");

        
        boolean added = cities.add("Delhi");
        System.out.println("Trying to add 'Delhi' again: " + added); // false

        // Iterate using Iterator
        System.out.println("Cities in HashSet:");
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

