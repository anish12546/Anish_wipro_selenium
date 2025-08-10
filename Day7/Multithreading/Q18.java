package Assignment_7;



class MyTask1 extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " has finished.");
    }
}

public class Q18 {

	public static void main(String[] args) {
		MyTask1 t1 = new MyTask1();
        System.out.println("Before starting, is t1 alive? " + t1.isAlive());

        t1.start();

        System.out.println("After starting, is t1 alive? " + t1.isAlive());

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After join, is t1 alive? " + t1.isAlive());
        System.out.println("Main thread finished.");
	}

}