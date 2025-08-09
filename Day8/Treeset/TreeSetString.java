//Q1
package Assignment8_treeset;

import java.util.TreeSet;

public class TreeSetString {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();

        // Adding country names in random order
        countries.add("India");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Australia");
        countries.add("Denmark");

        
        System.out.println("Sorted countries: " + countries);
    }
}
