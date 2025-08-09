//Q3
package Assignment8_Vector;

import java.util.Vector;

public class VectorCopyCompare {
    public static void main(String[] args) {
       
        Vector<String> vector1 = new Vector<>();
        vector1.add("Apple");
        vector1.add("Banana");
        vector1.add("Cherry");

       
        Vector<String> vector2 = new Vector<>();

       
        vector2.addAll(vector1);

        
        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);

        
        if (vector1.equals(vector2)) {
            System.out.println("Both vectors are equal.");
        } else {
            System.out.println("Vectors are not equal.");
        }
    }
}
