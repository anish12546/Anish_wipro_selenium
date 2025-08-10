package Assignment_7;


class MyTask extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false;
    }
}

public class Q9 {
    public static void main(String[] args) {
        MyTask t = new MyTask();
        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.stopThread();
    }
}