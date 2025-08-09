//Q2
package Assignment8_DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedOrderSystem {
    public static void main(String[] args) {
        Deque<String> orders = new ArrayDeque<>();

        // Add items front and rear
        orders.addFirst("Order1");
        orders.addLast("Order2");
        orders.addFirst("Order3");
        orders.addLast("Order4");

        System.out.println("After adding items: " + orders);

        // Remove items front and rear
        String removedFront = orders.removeFirst();
        System.out.println("Removed from front: " + removedFront);
        System.out.println("Deque now: " + orders);

        String removedRear = orders.removeLast();
        System.out.println("Removed from rear: " + removedRear);
        System.out.println("Deque now: " + orders);
    }
}

