//Q2
package Assignment8_Queue;
import java.util.LinkedList;
import java.util.Queue;

public class TaskManager {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

       
        tasks.offer("Check Email");
        tasks.offer("Write Report");
        tasks.offer("Attend Meeting");

      
        System.out.println("Next task: " + tasks.peek());

        
        while (!tasks.isEmpty()) {
            String completed = tasks.poll();
            System.out.println("Completed: " + completed);
            System.out.println("Remaining Tasks: " + tasks);
        }
    }
}


