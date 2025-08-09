//Q2
package Assignment8_PriorityQueue;

import java.util.PriorityQueue;

class PrintJob implements Comparable<PrintJob> {
    String jobName;
    int priority;

    public PrintJob(String jobName, int priority) {
        this.jobName = jobName;
        this.priority = priority;
    }

    @Override
    public int compareTo(PrintJob other) {
        // Higher priority served first
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class PrintJobsPriority {
    public static void main(String[] args) {
        PriorityQueue<PrintJob> jobQueue = new PriorityQueue<>();

        jobQueue.add(new PrintJob("Job1", 2));
        jobQueue.add(new PrintJob("Job2", 5));
        jobQueue.add(new PrintJob("Job3", 1));
        jobQueue.add(new PrintJob("Job4", 4));

        System.out.println("Serving print jobs by priority:");
        while (!jobQueue.isEmpty()) {
            System.out.println("Serving: " + jobQueue.poll());
        }
    }
}

