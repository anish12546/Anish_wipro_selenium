//Q4
package Assignment8_Vector;

import java.util.Vector;

public class VectorSum {

    
    public static int sumOfVector(Vector<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Vector<Integer> values = new Vector<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);

       
        int result = sumOfVector(values);

        
        System.out.println("Sum of Vector elements: " + result);
    }
}

