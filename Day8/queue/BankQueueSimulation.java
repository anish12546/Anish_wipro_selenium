//Q1
package Assignment8_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueueSimulation {
    public static void main(String[] args) {
        Queue<String> bankQueue = new LinkedList<>();

        // Add 5 customers
        bankQueue.add("Alice");
        bankQueue.add("Bob");
        bankQueue.add("Charlie");
        bankQueue.add("Diana");
        bankQueue.add("Ethan");

        System.out.println("Initial Queue: " + bankQueue);

        // Serve customers one by one
        while (!bankQueue.isEmpty()) {
            String served = bankQueue.poll();
            System.out.println("Serving customer: " + served);
            System.out.println("Remaining Queue: " + bankQueue);
        }
    }
}

