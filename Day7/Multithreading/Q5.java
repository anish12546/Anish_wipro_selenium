package Assignment_7;


class YieldThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.yield(); // Hint to scheduler
        }
    }
}

public class Q5 {

	public static void main(String[] args) {
		YieldThread t1 = new YieldThread();
        YieldThread t2 = new YieldThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

	}

}