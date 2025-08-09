//Q3
package Assignment8_PriorityQueue;

import java.util.PriorityQueue;

public class MergePriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        pq1.add(5);
        pq1.add(10);
        pq1.add(15);

        pq2.add(7);
        pq2.add(3);
        pq2.add(20);

        PriorityQueue<Integer> merged = mergePriorityQueues(pq1, pq2);

        System.out.println("Merged PriorityQueue elements:");
        while (!merged.isEmpty()) {
            System.out.println(merged.poll());
        }
    }

    public static <T> PriorityQueue<T> mergePriorityQueues(PriorityQueue<T> pq1, PriorityQueue<T> pq2) {
        PriorityQueue<T> merged = new PriorityQueue<>(pq1);
        merged.addAll(pq2);
        return merged;
    }
}
