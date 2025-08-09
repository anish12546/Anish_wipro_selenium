//Q1
package Assignment8_PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient {
    String name;
    int severityLevel;

    public Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severityLevel + ")";
    }
}

public class HospitalEmergencyQueue {
    public static void main(String[] args) {
        // Comparator to serve highest severity first (descending order)
        Comparator<Patient> severityComparator = (p1, p2) -> Integer.compare(p2.severityLevel, p1.severityLevel);

        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>(severityComparator);

        // Add patients
        emergencyQueue.add(new Patient("Alice", 5));
        emergencyQueue.add(new Patient("Bob", 10));
        emergencyQueue.add(new Patient("Charlie", 3));
        emergencyQueue.add(new Patient("Diana", 8));

        System.out.println("Serving patients by severity:");
        while (!emergencyQueue.isEmpty()) {
            System.out.println("Serving: " + emergencyQueue.poll());
        }
    }
}
