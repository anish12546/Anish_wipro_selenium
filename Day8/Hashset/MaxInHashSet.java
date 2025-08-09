//Q3
package Assignment8_HashSet;

import java.util.HashSet;

public class MaxInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(45);
        numbers.add(23);
        numbers.add(89);
        numbers.add(67);

        int max = findMax(numbers);
        System.out.println("Maximum number: " + max);
    }

    
    public static int findMax(HashSet<Integer> set) {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Set is empty");
        }

        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
