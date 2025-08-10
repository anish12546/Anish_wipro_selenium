package Assignment_7;



public class Q19 {

	public static void main(String[] args) {
		ThreadGroup parentGroup = new ThreadGroup("ParentGroup");

        Thread t1 = new Thread(parentGroup, () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread-1 interrupted");
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(parentGroup, () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-2: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread-2 interrupted");
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        System.out.println("Active Count: " + parentGroup.activeCount());
        System.out.println("Thread Group Name: " + parentGroup.getName());

        parentGroup.list();

	}

}
