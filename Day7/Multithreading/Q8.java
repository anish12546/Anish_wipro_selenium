package Assignment_7;



class sample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted.");
            }
        }
    }
}

public class Q8 {

	public static void main(String[] args) {
		sample t = new sample();
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread resumes after child thread completes.");

	}

}
