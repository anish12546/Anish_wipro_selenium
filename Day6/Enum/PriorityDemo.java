//q5
package assignment6_enum_package;

public class PriorityDemo {

    enum PriorityLevel {
        LOW(1),
        MEDIUM(3),
        HIGH(7),
        CRITICAL(10);

        private final int severity;

        
        PriorityLevel(int severity) {
            this.severity = severity;
        }

        
        public int getSeverity() {
            return severity;
        }

        
        public boolean isUrgent() {
            return severity >= 6;
        }

        
       
        public String toString() {
            return this.name() + " (Severity: " + severity + ")";
        }
    }

    public static void main(String[] args) {
        for (PriorityLevel level : PriorityLevel.values()) {
            System.out.println(level + " — Urgent? " + level.isUrgent());
        }
    }
}
