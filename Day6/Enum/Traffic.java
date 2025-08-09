//Q6
package assignment6_enum_package;

public class Traffic {

    
    interface State {
        TrafficLight next();
    }

    
    enum TrafficLight implements State {
        RED {
            public TrafficLight next() {
                return GREEN;
            }
        },
        GREEN {
            public TrafficLight next() {
                return YELLOW;
            }
        },
        YELLOW {
            public TrafficLight next() {
                return RED;
            }
        };
    }

    // 3. Simulate the transitions
    public static void main(String[] args) {
        TrafficLight current = TrafficLight.RED;

        System.out.println("Starting traffic light simulation:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Light: " + current);
            current = current.next();  
        }
    }
}
