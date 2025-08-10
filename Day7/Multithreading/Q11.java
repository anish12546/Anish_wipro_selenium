package Assignment_7;



class Counters {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class CounterThread1 extends Thread {
    Counters counter;

    CounterThread1(Counters counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Q11 {

	public static void main(String[] args) {
		Counters c = new Counters();

        CounterThread1 t1 = new CounterThread1(c);
        CounterThread1 t2 = new CounterThread1(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Final counter value: " + c.count);

	}

}