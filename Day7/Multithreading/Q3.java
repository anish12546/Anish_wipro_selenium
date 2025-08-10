package Assignment_7;



public class Q3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: Hello");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: Welcome");
            }
        });

        t1.start();
        t2.start();

	}

}