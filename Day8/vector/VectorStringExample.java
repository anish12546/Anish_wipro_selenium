//Q2
package Assignment8_Vector;

import java.util.Vector;

public class VectorStringExample {
    public static void main(String[] args) {
        
        Vector<String> names = new Vector<>();

        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        System.out.println("Original Vector: " + names);

        
        String searchName = "Charlie";
        if (names.contains(searchName)) {
            System.out.println(searchName + " is found in the vector.");
        } else {
            System.out.println(searchName + " is NOT found in the vector.");
        }

        
        int index = names.indexOf("Bob");
        if (index != -1) {
            names.set(index, "Brian");
            System.out.println("After replacing 'Bob' with 'Brian': " + names);
        } else {
            System.out.println("'Bob' not found to replace.");
        }

       
        names.clear();
        System.out.println("After clearing, vector size: " + names.size());
        System.out.println("Vector contents: " + names);
    }
}
