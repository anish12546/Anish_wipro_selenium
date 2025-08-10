package Assignment_7;



import java.time.LocalTime;

public class Q17 {

	public static void main(String[] args) {
		Thread clockThread = new Thread(() -> {
            while (true) {
                System.out.println("Current Time: " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted");
                }
            }
        });

        clockThread.setDaemon(true);
        clockThread.start();

        System.out.println("Main thread is running for 5 seconds...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");

	}

}