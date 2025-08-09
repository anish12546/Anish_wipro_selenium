//Q1
package Assignment8_Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>();

        
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("Original Vector: " + vector);

        
        vector.add(2, 25);
        System.out.println("After inserting 25 at index 2: " + vector);

        
        vector.remove(1);
        System.out.println("After removing element at index 1: " + vector);

        
        System.out.println("Elements using Enumeration:");
        Enumeration<Integer> enumeration = vector.elements();
        
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
