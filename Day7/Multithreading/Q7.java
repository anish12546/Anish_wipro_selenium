package Assignment_7;

class PriorityTask extends Thread {
    public PriorityTask(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Count: " + i);
        }
    }
}


public class Q7 {

	public static void main(String[] args) {
		PriorityTask t1 = new PriorityTask("Low Priority Thread");
        PriorityTask t2 = new PriorityTask("Medium Priority Thread");
        PriorityTask t3 = new PriorityTask("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

	}

}