//Q2
package Assignment8_treeset;

import java.util.TreeSet;

public class TreeSetInteger{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding numbers
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);

        System.out.println("TreeSet: " + numbers);
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        int num = 15;
        System.out.println("Lower than " + num + ": " + numbers.lower(num));
        System.out.println("Higher than " + num + ": " + numbers.higher(num));
    }
}

