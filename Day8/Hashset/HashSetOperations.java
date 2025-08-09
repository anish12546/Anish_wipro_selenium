//Q2
package Assignment8_HashSet;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Hyderabad");
        cities.add("Ahmedabad");
        cities.add("Jaipur");

        // Remove an element
        cities.remove("Hyderabad");
        System.out.println("After removing 'Hyderabad': " + cities);

        // Check if a city exists
        if (cities.contains("Pune")) {
            System.out.println("Pune is in the set.");
        } else {
            System.out.println("Pune is not in the set.");
        }

        
        
        System.out.println("Is the HashSet empty after clear()? " + cities.isEmpty());
    }
}
