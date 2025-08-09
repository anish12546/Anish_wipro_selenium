//Q3
package Assignment8_Queue;

import java.util.*;

public class EvenNumbersFromQueue {
    public static void main(String[] args) {
        Queue<Integer> numberQueue = new LinkedList<>();
        numberQueue.add(11);
        numberQueue.add(22);
        numberQueue.add(33);
        numberQueue.add(44);
        numberQueue.add(55);

        List<Integer> evenList = getEvenNumbers(numberQueue);
        System.out.println("Even numbers: " + evenList);
    }

    // Method to return even numbers from the queue
    public static List<Integer> getEvenNumbers(Queue<Integer> queue) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : queue) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
}
